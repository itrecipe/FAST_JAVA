package ch03;

public class FunctuinTest {
	//��ȯ��, �Ű������� �ִ� �޼���
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	//��ȯ���� ���� �Ű������� �ִ� �޼���
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	//��ȯ���� ������ �Ű������� ���� �޼���
	public static int calcSum()
	{
		int sum = 0;
		int i;
		for(i = 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		//�� �� ���� ���ϴ� �Լ�
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("����");
		
		total = calcSum();
		System.out.println(total);
	}
}