package ch11;

public class RelationalTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		boolean value = (num1 > num2); // num1 = 5 ���� num2 = 3�� ū��?
		System.out.println("5���� 3�� ū��? value����? : " + value); // ���غ� �� 5���� 3�� ū�� ������ true
		
		System.out.println(num1 < num2); //5���� 3�� ������? �� �� �׷��� ������ �翬�� ����� false
		System.out.println(num1 >= num2); // 5�� 3�� ũ�ų� ������? �� �� 5�� 3���� ũ�ϱ� ����� true
		System.out.println(num1 <= num2); //5�� 3���� �۰ų� ������? �� �� �׷��� ������ ����� false
		System.out.println(num1 == num2); //5�� 3�� ������? �� �� �׷��� ������ ����� false
		System.out.println(num1 != num2); //5�� 3�� �ƴѰ�? �� �� ������ ����� true
	}

}
