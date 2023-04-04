package ch18;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		input = scanner.nextInt();
	
		do {
			input = scanner.nextInt(); //수행문을 먼저 수행하고
			sum += input;
		} while(input != 0);//그다음 여기서 조건을 만난다.
			
		System.out.println(sum);
		}
		
}