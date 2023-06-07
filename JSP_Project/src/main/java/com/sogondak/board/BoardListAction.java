package com.sogondak.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogondak.action.Action;
import com.sogondak.action.ActionForward;
import com.sogondak.board.dao.BoardDAO;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {

		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		int totalCnt = bdao.getBoardCnt();

		// 페이징 처리 시작, 현재 넘겨받은 페이지
		String temp = request.getParameter("page");
		int page  = 0;

		page  = temp == null ? 1 : Integer.parseInt(temp);


		//[1][2][3]
		int pageSize = 10;
		int endRow = page  *10;
		int startRow = endRow -9;
		
		//클릭할 페이지[1][2][3][4]--- 에 대한 부분에서 이게 한 100개넘어가면 10개씩 나오도록할것이다
		int startPage = (page-1)/pageSize*pageSize +1;
		
		//마지막 페이지
		int endPage = startPage + pageSize -1;
		int totalPage = (totalCnt-1)/pageSize +1;
		
		endPage = endPage > totalPage? totalPage :  endPage;
		
		
		//1페이지에서 endRow값은 10, 4페이지에서 enRrow값은 40
		//1페이지의 startRowr값은 1, 4페이지에서는 31
		request.setAttribute("totalCnt", totalCnt);

		request.setAttribute("totalPage", totalPage);
		request.setAttribute("nowPage", page);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		
		request.setAttribute("boardList", bdao.getBoardList(startRow, endRow));
		forward.setRedirect(false);
		forward.setPath("/shop/contact.jsp");

		return forward;
	}

}