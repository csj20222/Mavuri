package ioSystem;

import java.util.HashMap;
import java.util.Map;
import menu.*;

public class RandomMachine {
	
	

	//Map타입의 <Integer, Food> 파라미터를 갖는 foodMap 전역변수 선언;
	// Key :Integer 타입  -  Value :Food 타입  
	private Map<Integer, Food> foodMap;		
	
	// 생성자
	// TODO	리스트 불러오는 메서드
	public RandomMachine() { 										
		// 리스트 
		foodMap = new HashMap<Integer, Food> ();   //<Integer, Food> 에서 Food는 부모클래스이고 저렇게 써놓으면 
		FastFood fastFood = new FastFood();					//	부모클래스를 상속받는 자식클래슬 모두 할당 있다.
		Korean koreanFood = new Korean();			
		Chinese chineseFood = new Chinese();				
		Japanese japaneseFood = new Japanese();
		Others otherFood = new Others();
		Western westernFood = new Western();
		VarietyPack varietyPack = new VarietyPack();
		
		// 모듬팩에  다른 리스트 값 추가
		varietyPack.addFood(fastFood);							// addFood 매서드는 리스트를 모두 가져오는 addAll 기능이 들어있음
		varietyPack.addFood(koreanFood);						//	버라이어티 팩은 모든 메뉴를 포함하고 있어야 하기 때문에 
		varietyPack.addFood(chineseFood);					// 이런 과정으로 모두 추가해주었고
		varietyPack.addFood(japaneseFood);					// 이 과정으로 각 음식 클래스에 새로운 음식을 추가해도
		varietyPack.addFood(otherFood);						// 버라이어티 팩에는 자동으로 추가됨 
		varietyPack.addFood(westernFood);
		
		
		// 해쉬맵에 값 추가
		foodMap.put(1, koreanFood);								// 선언된 해쉬맵에 키값과 키값에 해당하는 각 리스트들 할당 
		foodMap.put(2, westernFood );							// 키값으로 가져오기 때문에 순서는 상관없지만 
		foodMap.put(3, chineseFood );								// 보기 편하게 순서대로 작성 
		foodMap.put(4, japaneseFood );
		foodMap.put(5, fastFood );
		foodMap.put(6, otherFood );
		foodMap.put(7, varietyPack );
		
	}
	
	// TODO 리스트 사이즈크기 랜덤숫자 생성
	 public  String machine(int i) {									// TODO  입력받은 int 값으로 음식이름 최종 할당 메서드
		 Food  food = 	foodMap.get(i);								// 위에서 선언한 푸드맵의 키값을 받아오는 푸드클래스 객체 food 선언 
		 int size = food.getListSize();									// 키값으로 불러온 푸드맵에 할당되어있는 리스트의 리스트사이즈값 인트형 size 객체에 할당.
		 int index = random(0, size);									//	인트형 index에 랜덤메서드값 할당.
		 																
		 return food.getFoodName(index); 						// 푸드 클래스의 getFoodName에 index값 반환해주기
	
	 }
	// TODO 랜덤 메서드
		public int random(int min, int max) { 					
		       return (int)((Math.random() * (max - min)) + min);
		       // ((Math.random() * (max - min + 1)) + min)	 "+1"이 있었지만 가져와야 할 값인  리스트사이즈의 값은 
		       // 리스트 사이즈값보다 +1인 결과가 출력되기 때문에 이 메서드에서 "+1" 부분을 삭제 
		       // 리스트는 0부터 인덱스가 시작되기 때문이다.
		 }
}