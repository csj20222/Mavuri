<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
	<form action="${pageContext.request.contextPath}/user/UserLoginOK.us" method="post">
		<p>
			아이디 <input type="text" name="userid">
		</p>
		<p>
			비밀번호 <input type="password" name="userpw">
		</p>
		<p>
			<input type="submit" value="로그인하기">
		</p>
	</form>
		<p>
			<input type="button" value="회원가입하기" onclick="location.href='join.jsp'">
		</p>
	
	<c:if test="${param.flag == false}">
		<script>
			alert("로그인실패");
		</script>
	</c:if>
	<!-- 
		로그인 성공 : 	mainview.jsp    - DB
		로그인 시래 : loginview.jsp
	  -->
</body>
</html>