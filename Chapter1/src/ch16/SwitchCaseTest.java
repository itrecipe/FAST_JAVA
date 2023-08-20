package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		//�Ѵ��� �������� �˷��ִ� ���α׷� ����
		
		Scanner scanner = new Scanner(System.in); //���ڸ� �Է¹ޱ� ���� ��ĳ�� ���
		
		System.out.println("���� �Է��϶�");
		
		int month = scanner.nextInt(); //���� ������ �Է� �ޱ�
		
		int day; //���������� ǥ���ϱ� ���� ����� ����
		
		switch(month) {
			
			case 1:  case 3: case 5: case 7: case 8: case 10: case 12: //���� �ϼ� ���� ���ٿ� �ۼ��� �����ϴ�.
				day = 31;
				break; //break���� �Ⱦ��� ���� �������� �Ѿ�� ���� ���ѹ����� ������ �� ����� �Ѵ�.
			
			case 2: 
				day = 28;
				break;
			
			case 4: 
				day = 30;
				break;
			
			case 6: 
				day = 30;
				break;
			
			case 9: 
				day = 30;
				break;
			
			case 11: 
				day = 30;
				break;
			
			default :
				System.out.println("�������� �ʴ� �� �Դϴ�");
				day = -1;
		}
		System.out.println(month + "���� " + day + "�� �Դϴ�.");
	}
}