package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {
	//문자열이 지원되는 switch ~ case문
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //문자열을 받기 위해 스캐너 사용
		
		System.out.println("무슨 메달을 받을까?");
		String medal = scanner.next(); //스캐너로 문자열을 받아 출력하기
		
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
			default : //해당 하는 조건이 없을시 출력될 default 조건
				System.out.println("메달 x");
		}
	}
}
