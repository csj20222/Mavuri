package menu;

import java.util.ArrayList;

public class FastFood extends Food{
			public FastFood() { //생성자 생성
			super.foodList = new ArrayList<>();// 부모클래스 객체로 리스트초기화 
			// super 를 사용한 이유는 부모클래스의 객체를 받아오기 위해
			
			foodList.add("맥도날드");
			foodList.add("버거킹");
			foodList.add("맘스터치");
			foodList.add("서브웨이");
			foodList.add("이삭토스트");
			foodList.add("에그드랍");
			foodList.add("쉐이크쉑");
			foodList.add("KFC");
			foodList.add("롯데리아");
			foodList.add("타코벨");
			
		
			
			}	
			
	
	
	
		
		
	
}
