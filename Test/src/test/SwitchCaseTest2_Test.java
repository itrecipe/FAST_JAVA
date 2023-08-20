package test;

import java.util.Scanner;

public class SwitchCaseTest2_Test {
	//문자열이 지원되는 switch ~ case문 (응용예제)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("무슨 커피를 마실까?");
		
		String cafe = sc.next();
		
		switch(cafe) {
			case "americano":
				System.out.println("아메리카노를 마실래!");
				break;
			case "latte":
				System.out.println("라떼를 마실래!");
				break;
			case "coldbrew":
				System.out.println("콜드브루를 마실래!");
				break;
			default :
				System.out.println("마시고 싶은 커피가 없어!");
		}
	}
}