package test;

import java.util.Scanner;

public class ConitionTest_Test {

	public static void main(String[] args) {

		int max;
		System.out.println("�� ���� �Է� �޾� �� ū���� ����غ���\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է� ��� 1 : ");
		int num = scanner.nextInt();
		System.out.println("�Է� ��� 2 : ");
		int num1 = scanner.nextInt();

		
		max = (num > num1) ? num : num1;
		
		System.out.println("������ : " + max);
		
	}
}