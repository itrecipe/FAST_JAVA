package ch15;

public class IfIfTest {

	public static void main(String[] args) {
		int age = 12;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동");
		} 
		if(age < 14) {
			System.out.println("초등생");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("중학생, 고등학생");
		}
		else {
			charge = 3000;
		}
		System.out.println("입장료 : " + charge + "원");	
	}
}