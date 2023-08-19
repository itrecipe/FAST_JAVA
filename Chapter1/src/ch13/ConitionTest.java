package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하라!");
		
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		
		int num1 = scanner.nextInt(); //스캐너를 이용하여 정수를 받는 방법(한글x)
		System.out.println("입력 1 : ");
		
		int num2 = scanner.nextInt();
		System.out.println("입력 2 : ");
		
		max = (num1 > num2) ? num1 : num2; //삼항연산자 사용 ex) 조건식 ? true : false
		System.out.println("입력결과 : " + max);
	}
}