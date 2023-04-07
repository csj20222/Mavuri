package com.sogondak.app.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogondak.action.ActionForward;
@WebServlet("*.us")
public class UserFrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcese(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcese(req, resp);
	}
	
	protected void doProcese(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		ActionForward forward = null;
		
		if(requestURI.equals("/user/UserJoin.us")) {
			forward = new UserJoinAction().execute(request, response);
		}else if(requestURI.equals("/user/UserLogin.us")){
			forward = new ActionForward(false,"/app/user/loginview.jsp");
		}else if(requestURI.equals("/user/UserLoginOK.us")) {
			forward = new UserLoginOKAction().execute(request, response);
		}
		
		
	// 전송에 대한 일괄처리
		if (forward != null) {
			if (forward.isRedirect()) {
				//true : redirect
				response.sendRedirect(forward.getPath());
			}else {
				//false : forward
				RequestDispatcher disp = request.getRequestDispatcher(forward.getPath());
				disp.forward(request, response);
			}
		
		}
		
	}
	
	
}
