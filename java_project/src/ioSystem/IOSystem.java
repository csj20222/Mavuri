package ioSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOSystem {
	// TODO 질문 출력문
	public void printQuestion() {									
		System.out.println("*****************************************************************************");
		System.out.println("\t\t\t\t\t\t먹고싶은 메뉴뽑기 !");
		System.out.println();
		System.out.println("\t1. 한식\t 2.양식\t 3.중식\t 4.일식\t 5. 패스트푸드\t 6. 기타\t 7.완전랜덤  ");
		System.out.println("*****************************************************************************");
	}
	
	// TODO 마지막 인사말 출력문 메서드 
	public void printEnjoy() {																			
		System.out.println();
		System.out.println("\t\t\t\t\t\t맛있게 드세요~"); 
	}
	
	// TODO 원하는 음식 받아오는 메소드	
	// 랜덤머신클래스 객체 생성 및 초기화 
	public void getWantFood() { 																	 
		RandomMachine randomMachine = new RandomMachine();		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
		// TODO 예외처리&출력문반복
        int j = 0;									
        while (true){																	
            try {
            	System.out.print("\t\t\t\t\t\t\t");
            	j = scan.nextInt();																	//정수형 입력값 j에 할당 
            	System.out.println();
            	String food = randomMachine.machine(j);						//랜덤머신 클래스의 머신 메서드가 받는 리스트 내용물 받아오기 
                System.out.print("\t\t\t\t\t\t" +"    ");					
                System.out.println(food);					// 랜덤하게 받아온 음식명 출력
                break;
                
            }catch (NullPointerException e) {
                System.out.println("\t\t\t\t\t-----------------------------");
                System.out.println("\t\t\t\t\t잘못된 숫자를 입력했습니다.");
                System.out.println("\t\t\t\t\t1~7사이의 숫자를 입력해 주세요");
                System.out.println("\t\t\t\t\t-----------------------------");
                scan = new Scanner(System.in);
                
            }catch (InputMismatchException e) {
                System.out.println("\t\t\t\t\t-----------------------------");
                System.out.println("\t\t\t\t\t문자를 입력 하셨습니다.");
                System.out.println("\t\t\t\t\t숫자로 입력해 주세요");
                System.out.println("\t\t\t\t\t-----------------------------");
                scan = new Scanner(System.in);
                
            }catch (Exception e) {
                System.out.println("\t\t\t\t\t-----------------------------");
                System.out.println("\t\t\t\t\t알수없는 에러가 발생했습니다.");
                System.out.println("\t\t\t\t\t-----------------------------");
                scan = new Scanner(System.in);
            } 																			//	try 	catch 문 종료 
        }																				// while문 종료 
	}
	
}
