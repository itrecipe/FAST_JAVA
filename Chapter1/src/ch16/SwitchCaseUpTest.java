package ch16;

import java.util.Scanner;

public class SwitchCaseUpTest {
	//표현식을 사용하는 switch ~ case문
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하라");
		int month = scanner.nextInt();
		
		int day = switch(month) {
			case 1, 3, 5, 7, 8, 10, 12-> {
				System.out.println("이번달은 31일까지 이다.");
				yield 31;
			}
			case 2-> 
				28;
			case 4, 6, 9, 11-> 
				30;
			default-> {
				System.out.println("존재하지 않는 달");
				yield -1; //수행하는 값이 있고 반환해야 하는 값이 있을때 사용하는 키워드가 yield이다.
			}
		}; //문장의 끝을 알려줘야함
		
		System.out.println(month + "월은 " + day + "일 이다.");
	}
}