package test;

import java.util.Scanner;

public class IfElseIfElseTest_Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력 하세요!");
		String name = sc.next(); //이름을 받기 위한 변수 생성
		
		System.out.println("나이를 입력 하세요!");
		int age = sc.nextInt(); //나이를 정수로 받기 위한 변수생성
		
		int charge = 3000;
		
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동 입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초딩 입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중딩 or 고딩 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("어른 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
	}
}