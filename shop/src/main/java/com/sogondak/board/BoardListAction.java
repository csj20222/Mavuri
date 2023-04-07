package com.sogondak.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogondak.action.Action;
import com.sogondak.action.ActionForward;
import com.sogondak.board.dao.BoardDAO;

public class BoardListAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDAO bdao = new BoardDAO();
		ActionForward forward = new ActionForward();
		int totalCnt = bdao.getBoardCnt();
		
		// 페이징 처리
		// 현재 넘겨 받은 페이지 
		String temp = request.getParameter("page");
		int page = 0;
		page = temp == null ? 1 : Integer.parseInt(temp);
		//[1][2]...[10]
		int pageSize = 10;
		int endRow = page * 10;
		int startRow = endRow - 9;
		//[1][2]...[10] : 1,   [11][21]...[20] : 2 ...
		int startPage = (page - 1)/pageSize * pageSize + 1;
		int endPage = startPage + pageSize - 1;
		int totalPage = (totalCnt -1)/ pageSize + 1;
		
		endPage = endPage > totalPage ? totalPage : endPage;
		
		request.setAttribute("totalCnt", totalCnt);
		
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("nowPage", page);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		
		request.setAttribute("boardList", bdao.getBoardList(startRow, endRow));
		forward.setRedirect(false);
		forward.setPath("/contactlist.jsp");
		
		return forward;
	}

}
