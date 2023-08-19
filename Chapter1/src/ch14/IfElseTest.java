package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");
		
		String name = sn.next(); //이름을 받기 위한 변수		
		
		System.out.println("나이를 입력하시오");
		
		int age = sn.nextInt(); //정수를 받기 위한 변수
		
		if(age >= 8) {
			System.out.println("나이가 좀 있음");
		}
		else if(age <= 8) {
			System.out.println("어림");
		}

		System.out.println("시스템 종료");
	}
}