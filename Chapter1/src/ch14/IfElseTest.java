package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ�");
		
		String name = sn.next(); //�̸��� �ޱ� ���� ����		
		
		System.out.println("���̸� �Է��Ͻÿ�");
		
		int age = sn.nextInt(); //������ �ޱ� ���� ����
		
		if(age >= 8) {
			System.out.println("���̰� �� ����");
		}
		else if(age <= 8) {
			System.out.println("�");
		}

		System.out.println("�ý��� ����");
	}
}