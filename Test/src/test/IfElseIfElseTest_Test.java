package test;

import java.util.Scanner;

public class IfElseIfElseTest_Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է� �ϼ���!");
		String name = sc.next(); //�̸��� �ޱ� ���� ���� ����
		
		System.out.println("���̸� �Է� �ϼ���!");
		int age = sc.nextInt(); //���̸� ������ �ޱ� ���� ��������
		
		int charge = 3000;
		
		
		if(age < 8) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ� �Դϴ�.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ� �Դϴ�.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("�ߵ� or ��� �Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("� �Դϴ�.");
		}
		
		System.out.println("������ " + charge + "�� �Դϴ�.");
	}
}