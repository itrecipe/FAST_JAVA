package test;

import java.util.Scanner;

public class SwitchCaseUpTest_Test {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력 하세요!");
		
		int month = sc.nextInt();
		
		int day = switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println("이번달은 31일 까지 있네요!");
				yield 31;
			}
			
			case 2 ->
				28;
				
			case 4, 6, 9, 11 ->
				30;
				
			default -> {
				System.out.println("존재하지 않는 달 입니다.");
				yield -1;
			}
		};
		
		System.out.println(month + "월은 " + day + "일 까지 있어요!");
	}

}
