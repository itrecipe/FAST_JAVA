package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		//한달이 몇일인지 알려주는 프로그램 구현
		
		Scanner scanner = new Scanner(System.in); //숫자를 입력받기 위해 스캐너 사용
		
		System.out.println("월을 입력하라");
		
		int month = scanner.nextInt(); //월을 정수로 입력 받기
		
		int day; //몇일인지를 표현하기 위해 사용한 변수
		
		switch(month) {
			
			case 1:  case 3: case 5: case 7: case 8: case 10: case 12: //같은 일수 끼리 한줄에 작성도 가능하다.
				day = 31;
				break; //break문을 안쓰면 다음 문장으로 넘어가서 수행 시켜버리기 때문에 꼭 써줘야 한다.
			
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
				System.out.println("존재하지 않는 달 입니다");
				day = -1;
		}
		System.out.println(month + "월은 " + day + "일 입니다.");
	}
}