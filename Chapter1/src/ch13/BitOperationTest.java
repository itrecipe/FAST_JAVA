package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		
		int num1 = 5; //00000101 = 5
		int num2 = 10; //00001010 = 10
		
		System.out.println(num1 | num2); //OR
		System.out.println(num1 & num2); //AND
		System.out.println(num1 ^ num2); //XOR(Exclusive OR)
		System.out.println(~num1); //not(반전비트, 음수)
		
		System.out.println(num1 << 2); //왼쪽으로 2만큼 밀기(이동)
		System.out.println(num1 <<= 2); //왼쪽으로 2만큼 민것과 같음
		System.out.println(num1 >> 1); //오른쪽으로 1만큼 밀기 
		
		/* 2의 n승만큼 <<(곱해지거나) >>(나눠지는것)이 시프트 연산자
		   이해가 잘 안되면 8자리 비트를 그리면서 보면 쉽다.
		*/
	}
}