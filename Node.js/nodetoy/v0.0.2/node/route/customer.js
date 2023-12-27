const express = require('express');
const route = express.Route();

router
 .get("/", (req, res) => {  // HTTP 메서드 get 요청에 대한 조회 처리
   res.send('고객 정보 조회');
})
 .post("/insert", (req, res) => {  // HTTP 메서드 get 요청에 대한 저장 처리
   res.send('고객 정보 추가');
})
 .put("/update", (req, res) => {  // HTTP 메서드 get 요청에 대한 수정 처리
   res.send('고객 정보 수정');
})
 .delete("/delete", (req, res) => {  // HTTP 메서드 get 요청에 대한 삭제 처리
   res.send('고객 정보 삭제');
});