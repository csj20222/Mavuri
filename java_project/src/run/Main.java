package run;

import java.util.Scanner;			// 스캐너 클래스 호출

import ioSystem.IOSystem;

public class Main {
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// 스캐너 객체 생성 
    	IOSystem ioSystem = new IOSystem();					// IOSystem 객체 생성 
    	ioSystem.printQuestion();											// TODO 질문 메서드 호출
    	ioSystem.getWantFood();											// TODO 원하는 음식 입력받고 랜덤 값 출력 하는 메소드 호출 
    	ioSystem.printEnjoy();													// TODO 맛있게 드세요 메서드 호출 
		scanner.close();															//스캐너 종료	
      }

    

}
