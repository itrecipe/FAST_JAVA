package ch16;

import java.util.Scanner;

public class SwitchCaseUpTest {
	
	//ǥ������ ����ϴ� switch ~ case��
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է� �ϼ���");
		
		int month = scanner.nextInt();
		
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12-> {
				System.out.println("�̹����� 31�� ���� �ֽ��ϴ�.");
				yield 31;
			}
			
			case 2-> 
				28;
			
			case 4, 6, 9, 11-> 
				30;
			
			default-> { //������ �ΰ� �Ǵ� �� �̻��� ���� �߰�ȣ�� ����Ѵ�.
				System.out.println("�������� �ʴ� �� �Դϴ�.");
				yield -1; //�����ϴ� ���� �ְ� ��ȯ�ؾ� �ϴ� ���� ������ ����ϴ� Ű���尡 yield�̴�.
			}
		}; //�����ݷ��� �� ������ ���� �˷���� �Ѵ� (��ȯ���� �ֱ� ����)
		
		System.out.println(month + "���� " + day + "�� ���� �ֽ��ϴ�.");
	}
}