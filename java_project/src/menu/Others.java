package menu;

import java.util.ArrayList;

public class Others extends Food{
	public Others() {//생성자 생성
		super.foodList = new ArrayList<>(); // 부모클래스의 객체로 선언해서 리스트 초기화
		//super를 메서드 처럼 사용

		//데이터추가
		foodList.add("쌀국수");
		foodList.add("팟타이");
		foodList.add("뿌팟퐁커리");
		foodList.add("슈바인학센");
		foodList.add("분짜");
		foodList.add("똠양꿍");
		foodList.add("월남쌈");
		foodList.add("케밥");
		foodList.add("타코");
		foodList.add("빠에야");
		foodList.add("샤슬릭");
		foodList.add("부리또");
		foodList.add("인도커리");
		foodList.add("편의점");
	}
}
