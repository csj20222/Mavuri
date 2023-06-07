package menu;

import java.util.ArrayList;

public class VarietyPack extends Food{
	 	//생성자 생성
		public VarietyPack() {
			super.foodList = new ArrayList<>();							// 부모클래스 객체로 리스트초기화 
			return ;
		}
		
		public void addFood(Food food) {								//Food 클래스로만든 객체 food 값을 갖는 파라미터 
			super.foodList.addAll(food.getList());			
		}
		
		
		
		
		
		
}
