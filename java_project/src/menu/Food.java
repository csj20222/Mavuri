package menu;

import java.util.List;

//추상클래스 생성
public abstract class Food { 
	
	protected List<String> foodList;					//TODO foodList 선언 
	
	public List<String> getList() {						//TODO 버라이어티팩 클래스에서 리스트값 받아오기 위한 메서드 만들기
		return foodList;
	}

	public String getFoodName(int index) { 		// TODO 리스트 내용물을 가져오기 위해 메서드 만들기
		return foodList.get(index);
	}																			
	
	public int getListSize() {									// TODO 리스트 사이즈 값을 리턴받는 메서드 만들어주기
		return foodList.size();
	} 


}