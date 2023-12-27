# 🔍 라우팅이란?
- 라우팅이란 특정 엔드 포인트에 대한 클라이언트 요청에 서버가 응답하는 방법을 결정하는것으로
이 글에서의 라우팅은 화면에서 다른 화면으로 전환하는 내비게이션 기능이라고 생각하면 쉽다.

> **엔드포인트**
URI와 HTTP 요청 메서드(Get, Post, Put, Delete 등)로 구분된 클라이언트 요청을 말한다.

# 🖊️ 라우트구조
> **Express에서의 라우트 구조**
> ~~~javascript
> const express = require('express');
> const app = express();
> // 클라이언트에서 HTTP 요청 메서드 중
> // Get을 이용해서 'host:port'로 요청을 보내면
> // 실행되는 라우트
> app.get('/', (req, res) => {
>   res.send('Hello World!');
> });
> ~~~

~~~javascript
app.METHOD(PATH, HANDLER);
~~~


- **app** : Express의 인스턴스
- **METHOD** : HTTP 요청 메서드(Get, Post, Put, Delete 등)
- **PATH** : 서버에서의 경로
- **HANDLER** : 라우트(Route)가 일치할때 실행되는 함수

# 🖊️ 라우트 메서드
- 클라이언트에서 서버로 요청을 보낼 때 사용하는 HTTP 요청 메서드를 말한다.

- 클라이언트에서 get 을 사용해서 HTTP 요청 메서드를 서버로 전송했다면,
Express 라우트 메서드 역시 get으로 작성된 처리 코드가 있어야 해당 함수가 동작 된다.

### 예제코드

~~~javascript
const express = require('express');
const app = express();

app.listen(5000, () => {
  // 5000번 포트로 웹 서버 실행
  consol.log("Server started. port 5000");
});

// 클라이언트 HTTP 요청 메서드 Get 방식으로 'host:5000/practice'를 호출했을 경우
app.get("/practice", (req, res) => {
  res.send("get 요청에 대한 응답");
});

// 클라이언트 HTTP 요청 메서드 Post 방식으로 'host:5000/practice'를 호출했을 경우
app.post("/practice", (req, res) => {
  res.send("post 요청에 대한 응답");
});

// 클라이언트 HTTP 요청 메서드 종류에 상관없는 방식으로 'host:5000/practice'를 호출했을 경우
app.all("/practice", (req, res) => {
  res.send("모든 요청에 대한 응답");
});
~~~

# 🖊️ 라우트 경로
- 요청 메서드와의 조합을 통해서 요청이 이루어질 수 있는 엔드 포인트를 정의해 준다.
라우트를 표기하는 방법에는 문자열, 패턴, 정규식이 있다.

### 문자열

~~~javascript
'/', '/about', '/about/practice'
~~~

### 패턴

~~~javascript
'/ab?cd'	// b?는 문자 b가 0개 혹은 1개가 있다는 표현.
'/ab+cd'	// b+는 문자 b가 1개 이상 있다는 표현.
'/ab*cd'	// 문자 ab와 cd사이에 문자가 없거나 혹은 어떤 문자도 올수 있다는 표현.
'ab(cd)?e'	// (cd)?는 문자 cd가 0번 혹은 1번 있을 수 있다는 표현.
~~~

### 정규식

~~~javascript
/a/			// 클라이언트에서 요청한 라우트 경로에 a가 포함되어 있는 경우
/^insert/	// 클라이언트에서 요청한 라우트 경로가 문자 insert로 시작하는 경우
~~~

# 🖊️ 라우트 핸들러
- 클라이언트 요청에 따라 라우트가 일치하는 경우 실행되는 콜백 함수이다.

>라우트 핸들러에서 사용되는 **매개변수**
- req : Request로 클라이언트의 요청 정보를 담고 있다.
- res : Response로 클라이언트에게 응답하기 위한 정보를 담고 있다.
- next : 다음 미들웨어 함수를 가리키는 Object이다.

### next
~~~javascript
// 콜백 함수의 세 번째 매개변수로 next 오브젝트 사용
app.get('/example', (req, res, next) => {
  console.log('첫 번째 콜백 함수');
  next();  //다음 콜백 함수 호출
},(req, res) => {
  res.send('두 번째 콜백 함수'); //클라이언트로 응답
});
~~~

### 콜백 함수 배열
~~~javascript
const ex0 = (req, res, next) => {
  console.log('첫 번째 콜백 함수');
  next();	// 다음 콜백 함수 호출
};

const ex1 = (req, res, next) => {
  console.log('두 번째 콜백 함수');
  next();	// 다음 콜백 함수 호출
};

const ex2 = (req, res, next) => {
  res.send('세 번째 콜백 함수'); // 클라이언트로 응답
};

app.get('/practice', [ex0, ex1, ex2]); // 콜백 함수 배열로 정의
~~~

# 🖊️ 응답 메서드
- 다음 메서드 중에 한가지 방법으로 응답 해야 한다.
서버에서 응답하지 않은 경우에 클라이언트는 응답을 받지 못하고 정지된 상태를 유지한다.

| 응답 메서드 | 설명 |
|----|----|
|**res.download()**|파일을 다운로드 하도록 프롬프트|
|**res.end()**|응답 프로세스를 종료한다.|
|**res.json()**|JSON 응답을 전송한다|
|**res.jsonp()**|JSONP 지원을 통해JSON 응답을 전송한다.|
|**res.redirect()**|요청의 경로를 재지정해 준다.|
|**res.render()**|뷰(view)템플릿을 렌더링 해준다.|
|**res.send()**|다양한 유형의 응답을 전송한다.|
|**res.sendFile()**|파일을 octet스트림으로 전송한다.|
|**res.sendStatus()**|응답 상태 코드를 설정한 후 해당 코드를 응답 본문(body)에 담아서 전송한다. <br>(404 Not Found 등)|


# 🖊️ 라우트 처리
- app.route() : 모듈식 라우트를 작성하면 중복성이 감소해 효율적인 코드 관리가 가능하다.


### app.route()
- Get, Post, Put 과 같은 라우트 메서드를 한곳에 작성할 수 있다.
~~~javascript
// 모듈식 라우터 - 하나의 라우트 경로에 각 라우트 메서드를 처리
app.route('/practice')
 .get((req, res) => {  // HTTP 메서드 get 요청에 대한 조회 처리
   res.send('정보 조회');
})
 .post((req, res) => {  // HTTP 메서드 get 요청에 대한 저장 처리
   res.send('정보 추가');
})
 .put((req, res) => {  // HTTP 메서드 get 요청에 대한 수정 처리
   res.send('정보 수정');
})
 .delete((req, res) => {  // HTTP 메서드 get 요청에 대한 삭제 처리
   res.send('정보 삭제');
})

~~~

### express.Router
- 라우트 처리를 여러 개의 파일로 분리해 구현이 가능하다.

<spen style="color:ForestGreen">**routes/customer.js**</spen>

~~~javascript
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
~~~

<spen style="color:ForestGreen">**route/product.js**</spen>

~~~javascript
const express = require('express');
const route = express.Route();

router
 .get("/", (req, res) => {  // HTTP 메서드 get 요청에 대한 조회 처리
   res.send('상품 정보 조회');
})
 .post("/insert", (req, res) => {  // HTTP 메서드 get 요청에 대한 저장 처리
   res.send('삼품 정보 추가');
})
 .put("/update", (req, res) => {  // HTTP 메서드 get 요청에 대한 수정 처리
   res.send('상품 정보 수정');
})
 .delete("/delete", (req, res) => {  // HTTP 메서드 get 요청에 대한 삭제 처리
   res.send('상품 정보 삭제');
});
~~~
<spen style="color:ForestGreen">**app.js**</spen>

~~~javascript
const express = require('express');
const customerRoute = require('./routes/customer'); // customer 라우트를 추가
const proeuctRoute = require('./routes/product'); 	// product 라우트를 추가
const app = express();

app.use(express.json({
  limit: '50mb;	// 최대 50 메가
})); // 클라이언트 요청 body를 json으로 파싱 처리
app.listen(5000, () => {
  // 5000번 포트로 웹 서버 실행
  consol.log('Server starte. port 5000.');
})

app.use('/customer', customerRoute); // customer 라우트를 추가하고 기본 경로로 /customer  사용
app.use('/product', productRoute); // product 라우트를 추가하고 기본 경로로 /product  사용
~~~

- 위의 라우터 처리 방식과 Json-server를 이용하면 간단한 CRUD 기능을 만들 수 있다.
