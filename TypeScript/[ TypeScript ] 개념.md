# 📁 TypeScript 란?
> **TypeScript는 정적 타입 언어이며 동적 타입 언어인 JavaScript을 보완해서 정적 타입 문법을 추가한 '프로그래밍 언어' 입니다.**

JavaScript의 슈퍼 셋, 즉 상위 확장자로 JavaScript 엔진을 사용하며 자신이 원하는 변수의 타입을 정의하고 프로그래밍을 하면 JavaScript로 컴파일되어 실행할 수 있습니다. 

TypeScript를 사용하는 이유는

> - **오류를 사전에 방지할 수 있다.**
> - **코드의 자동완성 및 가이드를 받을수 있다.(생산성 향상)**


# 💡 TypeScript의 특징

**🔍 정적 타입**
- 컴파일을 하는 과정에서 타입을 결정하게 된다.
- 컴파일시 자료형에 맞지 않는 값이 들어가면 컴파일 에러를 발생 시킨다.
하지만 TypeScript는 컴파일 과정에서 타입을 지정하기 때문에 컴파일 에러를 예방할 수 있을 뿐 아니라, 손쉬운 디버깅이 가능하다.

**🔍 객체 지향**
- TypeScript는 클래스, 제네릭, 인터페이스, 모듈 등 자바스크립트에서 제공하지 않는 객체 지향 프로그리맹(OOP)의 기능을 지원한다.
- 크고 복잡한 프로젝트 코드를 쉽게 구성 할 수 있고 객체 지향 언어에 익숙한 개발자가 JavaScript 프로젝트를 수행하는데 진입 장벽을 낮춰준다.

**🔍 IDE 지원**
- IDE(통합개발환경, Integrated Development Environment)을 포함한 다양한 도구의 지원을 받울 수 있다.
- 코딩, 디버그, 컴파일, 배포 등 프로그램 개발에 관련된 모든 작업을 하나의 프로그램 안에서 처리하는 환경을 제공하는 소프트웨어
- 대표적인 IDE : VScode, Eclipse

**🔍 ES6+ 기능 지원**
<img src="https://velog.velcdn.com/images/csj20222/post/bdd2a7be-423b-4c6c-a7b0-3ca8477caeb6/image.png" width= "50%">

- 최신 자바스크립트(ECMAScript)버전에서 추가된 기능들을 모드 지원합니다.
- 이를 통해 개발자는 최신 기술을 활용하며 더 간결하고 가독성 좋은 코드를 작성할 수 있습니다.

**🔍 JavaScript 호환성**
- TypeScript는 JavaScript와 100% 호환된다. 따라서 JavaScript를 사용할 수 있는 곳이라면 TypeScript도 쓸 수 있다.
- 위와 같은 특징으로 JavaScript를 사용한 프로젝트를 TypeScript로 점진적으로 전환할 수 있다.




# 💡 TypeScript의 단점

**🔍 학습 난이도**
- TypeScript는 타입의 제한을 받아 자료형을 비롯한 여러 기능을 익혀야 하기에 JavaScript보다 배우기 어렵다.
- 하지만 타입이 정해져 있기 때문에 프로젝트 규모가 커질수록 빠르게 데이터 구조를 파악할 수 있습니다.

**🔍 초기 세팅의 어려움**
- TypeScript는 독자적인 언어가 아니기 때문에 기존의 JavaScript 엔진에서 실행됩니다.
- 이를 위해 기본적으로 설치해야 하는 모듈들이 있고, 컴파일을 위한 옵션들도 설정해야 합니다.
- 이를 보완하기위해 'Create React App', 'Vue CLI', 'Anqualr CLI' 등 초기 세팅 도구를 활용할 수 있습니다.

**🔍 타입 지정으로 인한 생산성 저하 우려**

- 매번 타입을 지정해줘야 하는 번거로움과 타입 어노테이션으로 인한 타입 에러로 실제 개발보다 타입을 지정하는데 시간을 더 할애할 수 있기 때문이다.
- 이럴 경우 라이브러리 또는 프레임워크를 활용한다면 생산성 저하를 보완할 수 있다.


# ⭕ 결론
- 에러예방, 디버깅이 쉽다.
- IDE(통합개발환경)을 포함한 다양한 도구의 지원을 받을 수 있다.
- 객체 지향 프로그래밍을 지원하고 그로인해 객체 지향 언어를 기반하는 개발자의 진입 장벽을 낮춰준다.


# 📁 TypeScript와 호환성이 좋은 Library 'React'

<img src="https://velog.velcdn.com/images/csj20222/post/6cb01712-6c81-400f-846e-8589436af8f0/image.jpg" width="70%">

- Facebook(현 Meta) 에서 만든 JavaScript UI 라이브러리입니다.
- 복잡하고 동적인 웹 페이지 UI 개발에 초점을 맞춘 프론트엔트 라이브러리이다.
- 실시간 대시보드, 소셜 미디어 애플리케이션, 전자상거래 플랫폼 등에 많이 사용된다.
- 라이브러리는 프레임워크와 달리 개발자가 코드의 흐름과 제어를 직접 관리한다.
- 활발하고 다양한 커뮤니티 생태계를 가지고 있어서 문제 해결을 위한 자료와 지원을 쉽게 얻을 수 있다.




[참조 : TypeScript 사용하는 이유, 현직 웹 개발가 알려드립니다!](https://www.elancer.co.kr/blog/view?seq=183) <br>
[참조 : [TypeScript] 타입스크립트를 사용하는 이유는 뭘까?](https://velog.io/@hye_rin/TypeScript-%ED%83%80%EC%9E%85%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8%EB%A5%BC-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0%EB%8A%94-%EB%AD%98%EA%B9%8C)<br>
[참조 : 타입스크립트의 정의](https://aiday.tistory.com/96)
