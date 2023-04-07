<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
        <div class="row py-5">
            <form class="col-md-9 m-auto" method="post" role="form" name="boardForm" action="${pageContext.request.contextPath}/board/BoardWriteOK.bo">
                <div class="row">
                    <div class="form-group col-md-6 mb-3">
                        <label for="inputname">이름</label>
                        <input type="text" class="form-control mt-1" id="name" name="username" placeholder="이름">
                    </div>
                </div>
                <div class="mb-3">
                    <label for="inputsubject">제목</label>
                    <input type="text" class="form-control mt-1" id="subject" name="boardtitle" placeholder="제목">
                </div>
                <div class="mb-3">
                    <label for="inputmessage">내용</label>
                    <textarea class="form-control mt-1" id="message" name="boardcontents" placeholder="내용" rows="8"></textarea>
                </div>
                <div class="row">
                    <div class="col text-end mt-2">
	                    <a href="javascript:document.boardForm.submit()">[등록]</a>&nbsp;&nbsp;&nbsp;
	         			<a href="${pageContext.request.contextPath}/board/BoardList.bo">[목록]</a>
                    </div>
                </div>
            </form>
        </div>
</body>
</html>