<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>SOGONDAK MARKET</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="assets/img/apple-icon.png">
    <link rel="shortcut icon" type="image/x-icon" href="assets/웹사이트 img/나봉이1.jpg">

    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/templatemo.css">
    <link rel="stylesheet" href="assets/css/custom.css">

    <!-- Load fonts style after rendering the layout styles -->
    <link rel="stylesheet" href="assets/css/fontawesome.min.css">
</head>

<body>
    <!-- Start Top Nav -->
    <nav class="navbar navbar-expand-lg bg-dark navbar-light d-none d-lg-block" id="templatemo_nav_top">
      <jsp:include page="topnav.jsp" />
    </nav>
    <!-- Close Top Nav -->


    <!-- Header -->
    <nav class="navbar navbar-expand-lg navbar-light shadow">
        <jsp:include page="header.jsp" />
    </nav>
    <!-- Close Header -->

    <!-- Modal -->
    <div class="modal fade bg-white" id="templatemo_search" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <jsp:include page="modal.jsp" />
    </div>


    <!-- Start Content Page -->
    <div class="container-fluid bg-light py-5">
        <div class="col-md-6 m-auto text-center">
            <h1 class="h1">로그인</h1>
            <p>
                항상 저희 소곤닥을 찾아주셔서 감사합니다.<br>
            </p>
        </div>
    </div>

    <!-- Start Login -->
    <div class="text-center">
    	<jsp:include page="${pageContext.request.contextPath}/app/user/loginview.jsp"/>
    </div>
    <!-- End Login -->


    <!-- Start Footer -->
    <footer class="bg-dark" id="tempaltemo_footer">
        <jsp:include page="footer.jsp" />
    </footer>
    <!-- End Footer -->

    <!-- Start Script -->
    <script src="assets/js/jquery-1.11.0.min.js"></script>
    <script src="assets/js/jquery-migrate-1.2.1.min.js"></script>
    <script src="assets/js/bootstrap.bundle.min.js"></script>
    <script src="assets/js/templatemo.js"></script>
    <script src="assets/js/custom.js"></script>
    <!-- End Script -->
</body>

</html>