package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {
	//���ڿ��� �����Ǵ� switch ~ case��
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� ���� �޴��� ������?");
		String medal = scanner.next();
		
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
			default :
				System.out.println("�޴� x");
		}
	}

}
