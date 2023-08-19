package test;

import java.util.Scanner;

public class ConitionTest_Test {

	public static void main(String[] args) {

		int max;
		System.out.println("두 수를 입력 받아 더 큰수를 출력해보자\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 결과 1 : ");
		int num = scanner.nextInt();
		System.out.println("입력 결과 2 : ");
		int num1 = scanner.nextInt();

		
		max = (num > num1) ? num : num1;
		
		System.out.println("연산결과 : " + max);
		
	}
}