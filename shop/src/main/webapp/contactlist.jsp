<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>SOGONDAK MARKET</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/assets/img/apple-icon.png">
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/웹사이트 img/나봉이1.jpg">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/templatemo.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/custom.css">

    <!-- Load fonts style after rendering the layout styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/fontawesome.min.css">
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
            <h1 class="h1">문의 게시판</h1>
            <p>
                항상 저희 소곤닥을 찾아주셔서 감사합니다.<br>
                문의글을 남겨 주시면 성심성의껏 답변드리겠습니다.
            </p>
        </div>
    </div>

    <!-- Start Contact -->
    <div class="container py-5">
		<jsp:include page="${pageContext.request.contextPath}/board/boardList.jsp" />
    </div>
    <!-- End Contact -->


    <!-- Start Footer -->
    <footer class="bg-dark" id="tempaltemo_footer">
        <jsp:include page="footer.jsp" />
    </footer>
    <!-- End Footer -->

    <!-- Start Script -->
    <script src="${pageContext.request.contextPath}/assets/js/jquery-1.11.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/jquery-migrate-1.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.bundle.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/templatemo.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/custom.js"></script>
    <!-- End Script -->
</body>

</html>