package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("�� �̸��� �Է��ض�");
		String name = sn.next();		
		
		System.out.println("�� ���̸� �Է��ض�");
		int age = sn.nextInt();
		
		if(age >= 8) {
			System.out.println("����̻���");
		}
		else if(age <= 8) {
			System.out.println("�� ����̻���");
		}
		
		System.out.println("�ý��� ����");
	}

}
