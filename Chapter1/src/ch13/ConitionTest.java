package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		
		int max;
		System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����϶�!");
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		System.out.println("�Է� 1 : ");
		
		int num2 = scanner.nextInt();
		System.out.println("�Է� 2 : ");
		
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
	}
}