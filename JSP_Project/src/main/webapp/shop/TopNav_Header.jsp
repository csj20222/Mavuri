<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<!-- Start Top Nav -->
    <nav class="navbar navbar-expand-lg bg-dark navbar-light d-none d-lg-block" id="templatemo_nav_top">
        <div class="container text-light">
            <div class="w-100 d-flex justify-content-between">
                <div>
                    <i class="fa fa-envelope mx-2"></i>
                    <a class="navbar-sm-brand text-light text-decoration-none" href="mailto:sogondak_@naver.com">sogondak_@naver.com</a>
                    <i class="fa fa-phone mx-2"></i>
                    <a class="navbar-sm-brand text-light text-decoration-none" href="tel:010-2643-2428">010-2643-2428</a>
                </div>
                <div>
                    <a class="text-light" href="https://www.facebook.com/profile.php?id=100083355710843&mibextid=LQQJ4d" target="_blank" rel="sponsored"><i class="fab fa-facebook-f fa-sm fa-fw me-2"></i></a>
                    <a class="text-light" href="https://www.instagram.com/sogondak/" target="_blank"><i class="fab fa-instagram fa-sm fa-fw me-2"></i></a>
<!--                     <a class="text-light" href="https://twitter.com/" target="_blank"><i class="fab fa-twitter fa-sm fa-fw me-2"></i></a> -->
<!--                     <a class="text-light" href="https://www.linkedin.com/" target="_blank"><i class="fab fa-linkedin fa-sm fa-fw"></i></a> -->
                </div>
            </div>
        </div>
    </nav>
    <!-- Close Top Nav -->


    <!-- Header -->
    <nav class="navbar navbar-expand-lg navbar-light shadow">
        <div class="container d-flex justify-content-between align-items-center">

            <a class="navbar-brand text-success logo h1 align-self-center" href="${pageContext.request.contextPath}/shop/index.jsp">
                Sogondak
            </a>

            <button class="navbar-toggler border-0" type="button" data-bs-toggle="collapse" data-bs-target="#templatemo_main_nav" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="align-self-center collapse navbar-collapse flex-fill  d-lg-flex justify-content-lg-between" id="templatemo_main_nav">
                <div class="flex-fill">
                    <ul class="nav navbar-nav d-flex justify-content-between mx-lg-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/shop/index.jsp">홈</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/shop/about.jsp">소개</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/ItemList.it">상품</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/BoardList.bo">고객센터</a>
                        </li>
                    </ul>
                </div>
                <div class="navbar align-self-center d-flex">
                    <div class="d-lg-none flex-sm-fill mt-3 mb-4 col-7 col-sm-auto pr-3">
                        <div class="input-group">
                            <input type="text" class="form-control" id="inputMobileSearch" placeholder="Search ...">
                            <div class="input-group-text">
                                <i class="fa fa-fw fa-search"></i>
                            </div>
                        </div>
                    </div>
<!--                     <a class="nav-icon d-none d-lg-inline" href="#" data-bs-toggle="modal" data-bs-target="#templatemo_search"> -->
<!--                         <i class="fa fa-fw fa-search text-dark mr-2"></i> -->
<!--                     </a> -->
                    <!--start 로그인 안 된 상태 -->
                    <c:if test="${empty userIsLogin}">
                    <a class="nav-icon position-relative text-decoration-none" href="javascript:loginPlz()">
                        <i class="fa fa-fw fa-cart-arrow-down text-dark mr-1"></i>
                        <span class="position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark">장바구니</span>
                    </a>
                    </c:if>
                    <!--End 로그인 안 된 상태 -->
					<!--Start 로그인 된 상태 -->
					<c:if test="${not empty userIsLogin}">
                    <a class="nav-icon position-relative text-decoration-none" href="${pageContext.request.contextPath}/BasketView.bs?userIDNumber=${userIsLogin.userIDNumber}">
                        <i class="fa fa-fw fa-cart-arrow-down text-dark mr-1"></i>
                        <span class="position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark">장바구니</span>
                    </a>
                    <!--End 로그인 된 상태 -->
          		    </c:if>      
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        
                        
	        <!--start 로그인 안 된 상태 -->
			<c:if test="${empty userIsLogin}">
			    <a class="nav-icon position-relative text-decoration-none" href="${pageContext.request.contextPath}/shop/loginOrJoin.jsp">
                        <i class="fa fa-fw fa-user text-dark mr-3"></i>
                        <span class="position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark">로그인</span>
                </a>
			</c:if>
			<!--End 로그인 안 된 상태 -->
			<!--Start 로그인 된 상태 -->
			<c:if test="${not empty userIsLogin}">
			    <a class="nav-icon position-relative text-decoration-none" href="${pageContext.request.contextPath}/UserLogOut.us">
                        <i class="fa fa-fw fa-user text-dark mr-3"></i>
                        <span class="position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark">로그아웃</span>
                </a>
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   ${userIsLogin.username}님 환영합니다
			</c:if>
			<!--End 로그인 된 상태 -->
                </div>
            </div>

        </div>
    </nav>
    <!-- Close Header -->
</body>
</html>