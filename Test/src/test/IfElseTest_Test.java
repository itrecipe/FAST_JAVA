package test;

import java.util.Scanner;

public class IfElseTest_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		
		String name = sc.next();
		
		System.out.println("나이 입력 : ");
		
		int age = sc.nextInt();
		
		if(age >= 10) {
			System.out.println("나이가 많아요");
		}
		else if(age <= 10) {
			System.out.println("나이가 어려요");
		}
		System.out.println("시스템 종료");
	}

}
