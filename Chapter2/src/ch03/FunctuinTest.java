package ch03;

public class FunctuinTest {
	//반환값, 매개변수가 있는 메서드
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	//반환값은 없고 매개변수는 있는 메서드
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	//반환값은 있지만 매개변수는 없는 메서드
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
		//두 개 값을 더하는 함수
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("ㅎㅇ");
		
		total = calcSum();
		System.out.println(total);
	}
}