package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {
		int age = 17;
		int charge = 3000;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동");
		} 
		else if(age < 14) {
			System.out.println("초등생");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중학생, 고등학생");
		}
		else {
			charge = 3000;
		}
		System.out.println("입장료 : " + charge + "원");
		
	}

}
