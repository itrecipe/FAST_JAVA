package test;

import java.util.Scanner;

public class SwitchCaseTest2_Test {
	//���ڿ��� �����Ǵ� switch ~ case�� (���뿹��)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� Ŀ�Ǹ� ���Ǳ�?");
		
		String cafe = sc.next();
		
		switch(cafe) {
			case "americano":
				System.out.println("�Ƹ޸�ī�븦 ���Ƿ�!");
				break;
			case "latte":
				System.out.println("�󶼸� ���Ƿ�!");
				break;
			case "coldbrew":
				System.out.println("�ݵ��縦 ���Ƿ�!");
				break;
			default :
				System.out.println("���ð� ���� Ŀ�ǰ� ����!");
		}
	}
}