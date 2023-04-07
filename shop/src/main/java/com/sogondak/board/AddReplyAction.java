package com.sogondak.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogondak.action.Action;
import com.sogondak.action.ActionForward;
import com.sogondak.board.dao.BoardDAO;
import com.sogondak.board.dao.ReplyBean;

public class AddReplyAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		ReplyBean reply = new ReplyBean();
		
		int boardnum = Integer.parseInt(request.getParameter("boardnum"));
		String replycontents = request.getParameter("replycontents");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		reply.setBoardnum(boardnum);
		reply.setReplycontents(replycontents);
		reply.setUsername(username);
		reply.setPassword(password);
		
		if(bdao.addReply(reply)) {
			// 등록성공
			forward.setRedirect(true);
			forward.setPath("/board/BoardView.bo?boardnum="+boardnum);
		}else {
			// 등록실패
			try {
				forward.setRedirect(false); // 리다이렉트를 포워드 방식으로 보낼거라는 뜻
				PrintWriter out;
				out = response.getWriter();
				out.println("<script> alert('댓글등록 실패!');history.back();</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return forward;
	}

}
