package ch15;

public class IfIfTest {

	public static void main(String[] args) {
		int age = 12;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ�");
		} 
		if(age < 14) {
			System.out.println("�ʵ��");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("���л�, �����л�");
		}
		else {
			charge = 3000;
		}
		System.out.println("����� : " + charge + "��");	
	}
}