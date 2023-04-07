package com.sogondak.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogondak.action.Action;
import com.sogondak.action.ActionForward;
import com.sogondak.board.dao.BoardBean;
import com.sogondak.board.dao.BoardDAO;

public class BoardWriteOkAction implements Action{

	// 글 등록에 대한 처리
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDAO bdao = new BoardDAO();
		BoardBean board = new BoardBean();
		ActionForward forward = new ActionForward();
		
		String boardtitle = request.getParameter("boardtitle");
		String boardcontents = request.getParameter("boardcontents");
		String username = request.getParameter("username");
		
		board.setBoardtitle(request.getParameter("boardtitle"));
		board.setBoardcontents(request.getParameter("boardcontents"));
		board.setUsername(request.getParameter("username"));
		
		
		if(bdao.insertBoard(board)) {
			// 다른 방법으로 해봄
			forward.setPath("/board/BoardWrite.bo");
//			forward.setPath("/board/boardwrite.jsp");
			forward.setRedirect(true);
		}else {
			
			forward.setPath("/board/BoardWrite.bo");
//			forward.setPath("/board/boardwrite.jsp?flag=false");
			forward.setRedirect(true);
		}
		return forward;
		
		
		
	}
	

}
