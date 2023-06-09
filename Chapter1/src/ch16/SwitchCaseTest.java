package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하라");
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
			case 1:  case 3: case 5: case 7: case 8: case 10: case 12: //같은 일수 끼리 한줄에 작성도 가능하다.
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			
			case 4: 
				day = 30;
				break;
			
			case 6: 
				day = 30;
				break;
			
			case 9: 
				day = 30;
				break;
			
			case 11: 
				day = 30;
				break;
			
			default :
				System.out.println("존재하지 않는 달");
				day = -1;
		}
		System.out.println(month + "월은 " + day + "일 이다.");
	}

}
