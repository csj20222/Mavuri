package com.sogondak.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogondak.action.Action;
import com.sogondak.action.ActionForward;
import com.sogondak.board.dao.BoardDAO;
import com.sogondak.board.dao.ReplyBean;

public class UpdateReplyAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		int boardnum = Integer.parseInt(request.getParameter("boardnum"));
		
		int replynum = Integer.parseInt(request.getParameter("replynum"));
		String replycontents = request.getParameter("reply"+replynum);
		
		if( bdao.updateReply(replynum, replycontents) ) {
			// 성공
			forward.setRedirect(true);
			forward.setPath("/board/BoardView.bo?boardnum="+boardnum);
		} else {
			// 실패
			try {
				forward.setRedirect(false);
				PrintWriter out;
				out = resp.getWriter();
				out.println("<script>alert('댓글수정 실패');history.back();</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		return forward;
	}

}














