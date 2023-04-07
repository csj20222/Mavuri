<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>    
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
            <h1 class="h1">상품 추가 하기</h1>
        </div>
    </div>

    <!-- Start Contact -->
    <div class="container py-5">
        <div class="row py-5">
            <form class="col-md-9 m-auto" method="get" role="form" action="/item/ItemInsert.it">
                <div class="row">
                    <div class="form-group col-md-6 mb-3">
                        <label>상품명</label>
                        <input type="text" class="form-control mt-1" id="itemname" name="itemname" placeholder="상품">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-6 mb-3">
                        <label>가격</label>
                        <input type="text" class="form-control mt-1" id="price" name="price" placeholder="가격">
                    </div>
                </div>
                <div class="mb-3">
                    <label>설명</label>
                    <textarea class="form-control mt-1" id="explain" name="explain" placeholder="설명" rows="8"></textarea>
                </div>
                <h6>규격</h6>
                   	<ul class="list-unstyled pb-3">
                        <li>
							<input type="text" placeholder="스펙 : spec" name="spec" id="spec"><br>
							<input type="text" placeholder="사이즈1 : size1" name="size1" id="size1"><br>
							<input type="text" placeholder="사이즈2 : size2" name="size2" id="size2"><br>
							<input type="text" placeholder="사이즈3 : size3" name="size3" id="size3"><br>
                        </li>
                	</ul>
                <div class="row">
                    <div class="col text-end mt-2">
					<input type="submit" value="상품 등록">
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!-- End Contact -->


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