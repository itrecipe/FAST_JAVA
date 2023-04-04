package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("니 이름을 입력해라");
		String name = sn.next();		
		
		System.out.println("니 나이를 입력해라");
		int age = sn.nextInt();
		
		if(age >= 8) {
			System.out.println("잼민이새끼");
		}
		else if(age <= 8) {
			System.out.println("비 잼민이새끼");
		}
		
		System.out.println("시스템 종료");
	}

}
