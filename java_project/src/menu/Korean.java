package menu;

import java.util.ArrayList;

//푸드클래스 상속
public class Korean extends Food{ 
		// 생성자 생성
		public Korean() {
			//	super();														이렇게 사용해도 되지만 어짜피 리스트 1개만 쓸것
			//	foodList = new ArrayList<>();				때문에 그냥 한번에 적어준다~
			super.foodList = new ArrayList<>();  		// 부모클래스 객체로 선언해서 리스트 초기화

			// 데이터 추가
			foodList.add("닭갈비");
			foodList.add("순대국밥");
			foodList.add("설렁탕");
			foodList.add("소머리국밥");
			foodList.add("백반집");
			foodList.add("김밥");
			foodList.add("라면");
			foodList.add("떡볶이");
			foodList.add("샤브샤브");
			foodList.add("족발");
			foodList.add("보쌈");
			foodList.add("곱창");
			foodList.add("국수");
			foodList.add("찜닭");
			foodList.add("쭈꾸미볶음");
			foodList.add("솥밥");
			foodList.add("오리불고기");
			foodList.add("김치찌개");
			foodList.add("불백");
			foodList.add("뼈해장국");
			foodList.add("감자탕");
			foodList.add("뼈찜");
			foodList.add("육회비빔밥");
			foodList.add("해물찜");
			foodList.add("곱창전골");
			foodList.add("부대찌개");
			foodList.add("된장찌개");
		
		
	
	}	
}
