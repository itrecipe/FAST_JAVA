package test;

import java.util.Scanner;

public class IfElseTest_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� �Է� : ");
		
		String name = sc.next();
		
		System.out.println("���� �Է� : ");
		
		int age = sc.nextInt();
		
		if(age >= 10) {
			System.out.println("���̰� ���ƿ�");
		}
		else if(age <= 10) {
			System.out.println("���̰� �����");
		}
		System.out.println("�ý��� ����");
	}

}
