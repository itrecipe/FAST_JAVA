package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {
	//���ڿ��� �����Ǵ� switch ~ case��
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //���ڿ��� �ޱ� ���� ��ĳ�� ���
		
		System.out.println("���� �޴��� ������?");
		String medal = scanner.next(); //��ĳ�ʷ� ���ڿ��� �޾� ����ϱ�
		
		switch(medal) {
			case "Gold":
				System.out.println("�ݸ޴�");
				break;
			case "Silver":
				System.out.println("���޴�");
				break;
			case "Bronze":
				System.out.println("���޴�");
				break;
			default : //�ش� �ϴ� ������ ������ ��µ� default ����
				System.out.println("�޴� x");
		}
	}
}
