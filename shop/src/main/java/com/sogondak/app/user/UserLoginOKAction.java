package com.sogondak.app.user;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogondak.action.Action;
import com.sogondak.action.ActionForward;
import com.sogondak.app.user.dao.UserDAO;

public class UserLoginOKAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		UserDAO udao = new UserDAO();
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		
		if(udao.login(userid,userpw)) {
			// 로그인 성공
			forward.setPath("/index.jsp");
		}else {
			// 로그인 실패
			forward.setPath("/login.jsp?flag=false");
		}
		forward.setRedirect(true);
		
		return forward;
	}
		
	
}
