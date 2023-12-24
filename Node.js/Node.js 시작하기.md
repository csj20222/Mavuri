# Node.js 설치

- https://nodejs.org/en

![](https://velog.velcdn.com/images/csj20222/post/02583f9d-789c-41e4-bc2a-3259a612c106/image.png)
- 공식 사이트에 들어가서 현재 사용중인 OS에 맞는 LTS버전(현 20.10.0) 파일 다운받기
---
![](https://velog.velcdn.com/images/csj20222/post/1833502d-0506-455c-a22f-b9f7124c8b2f/image.png)
- 설치하기
---
![](https://velog.velcdn.com/images/csj20222/post/008f3188-feee-460e-b717-dc54e6897c59/image.png)
- 설치후 터미널에 node -v 입력하면 현재 버전을 알려준다.
```
node -v        라고 입력하면
v20.10.0       라고 현 버전을 알려줌

```
- 터미널에 node를 입력해서 실행해주고 console.log('Hello World') 를 입력하면 실행되는 모습을 볼 수 있다.

~~~javascript
console.log('Hello World')
Hello World
~~~
---
---

# npm package 만들기
- npm은 JavaScript 런타입 환경인 node.js의 기본 패키지 관리자이다.
- 터미널에서 프로젝트를 만들 폴더로 경로를 이동해준다.
![](https://velog.velcdn.com/images/csj20222/post/9ebff1b3-202a-481d-baca-a0aa64606ebc/image.png)
- npm init 을 입력하면 여러가지 설정들이 나오는데 입력하고 싶은것들은 입력해서
Is this OK? 라는 문구가 나올때까지 엔터를 눌러준후 yes 입력해준다.
- Visual Studio로 프로젝트를 열어보면 설정한 폴더에 **package.json** 파일이 생성이 됐다.
- 서버를 시작하면 index.js 에서 시작하게 설정되어 있기 때문에
- **index.js** 파일 생성해주기

---
---
# Express 설치

![](https://velog.velcdn.com/images/csj20222/post/7beb1a10-4064-4f2c-9fab-673783c82d78/image.png)
- 터미널에 npm install express --save 입력하기
---
![](https://velog.velcdn.com/images/csj20222/post/68af223f-5b4d-4dd0-a009-ff9c704e4ded/image.png)
- 뒤에 --save를 붙여주는 이유는 package.json 코드중 dependencies 부분에 설치한 express가 자동으로 추가가 되기 때문이다.
---
---
# express 앱 만들기
https://expressjs.com/ko/starter/hello-world.html
![](https://velog.velcdn.com/images/csj20222/post/f7af3d05-e05f-40d6-bc03-3bb660bd14da/image.png)
~~~javascript
const express = require('express')	// 다운받은 express 모듈을 가져온다.
const app = express()				// 가져온 express 모듈의 function을 이용해서 새로운 express 앱(=app)을 만든다.
const port = 5000					// 포트는 본인 마음대로 설정한다.

app.get('/', (req, res) => {		// express 앱을 넣고 root directory에 오면
  res.send('Hello World!')			// "Hello World!"를 출력되게 해준다.
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)// 설정한 포트에서 이 앱을 실행한다.
})
~~~
- express 공식사이트에 들어가면 hello world 예제가 있다.
- 복사해서 index.js 파일에 붙여넣기 해준다.
---
![](https://velog.velcdn.com/images/csj20222/post/95496da2-283c-4bb1-ae50-397c162ad1c3/image.png)
- package.json 파일의 scripts 부분에 "start": "node index.js" 를 추가해준다.
- 저장 필수!!
---
---
# 로컬 서버열기
![](https://velog.velcdn.com/images/csj20222/post/4d7edad5-88db-4d68-aaa5-a796c8408b75/image.png)
- 터미널에서 프로젝트 경로로 들어가서
npm run start 를 입력해주면 설정해둔 5000포트로 로컬 서버가 열린다!
![](https://velog.velcdn.com/images/csj20222/post/ca0d09f5-c30b-490c-bb47-874a1c4a3880/image.png)
- localhost:5000으로 접속하면 Hello World를 만나볼 수 있다!
---
![](https://velog.velcdn.com/images/csj20222/post/8a89b7b0-5e02-4b3b-bfa6-c4842efa7aea/image.png)![](https://velog.velcdn.com/images/csj20222/post/e589356b-d9dc-4bac-9fbc-9a1440d45df5/image.png)

- 메시지를 변경하면 변경된 메시지도 확인해 볼 수 있다.






