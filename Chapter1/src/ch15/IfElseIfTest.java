package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {
		int age = 17;
		int charge = 3000;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ�");
		} 
		else if(age < 14) {
			System.out.println("�ʵ��");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("���л�, �����л�");
		}
		else {
			charge = 3000;
		}
		System.out.println("����� : " + charge + "��");
		
	}

}