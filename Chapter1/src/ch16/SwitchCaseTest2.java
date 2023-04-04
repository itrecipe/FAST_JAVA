package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {
	//문자열이 지원되는 switch ~ case문
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("넌 무슨 메달을 받을까?");
		String medal = scanner.next();
		
		switch(medal) {
			case "Gold":
				System.out.println("금메달");
				break;
			case "Silver":
				System.out.println("은메달");
				break;
			case "Bronze":
				System.out.println("동메달");
				break;
			default :
				System.out.println("메달 x");
		}
	}

}
