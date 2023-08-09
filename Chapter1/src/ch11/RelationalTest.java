package ch11;

public class RelationalTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		boolean value = (num1 > num2); // num1 = 5 보다 num2 = 3이 큰가?
		System.out.println("5보다 3이 큰가? value값은? : " + value); // 비교해본 후 5보다 3이 큰게 맞으니 true
		
		System.out.println(num1 < num2); //5보다 3이 작은가? 비교 후 그렇지 않으니 당연히 결과는 false
		System.out.println(num1 >= num2); // 5와 3이 크거나 같은가? 비교 후 5가 3보다 크니까 결과는 true
		System.out.println(num1 <= num2); //5가 3보다 작거나 같은가? 비교 후 그렇지 않으니 결과는 false
		System.out.println(num1 == num2); //5와 3이 같은가? 비교 후 그렇지 않으니 결과는 false
		System.out.println(num1 != num2); //5는 3이 아닌가? 비교 후 맞으니 결과는 true
	}

}
