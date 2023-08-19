package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) > 10) && ((i = i + 2) < 10);
		//boolean value1 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		
		/* 
		   - 논리 곱(&&)은 두 항의 결과가 모두 true일 때만 결과가 true
			 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음

			- 논리 합(||)은 두 항의 결과가 모두 false일 때만 결과가 false
			앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음

		   - 앞의 항이 이미 false이므로 컴퓨터는 더이상 뒤의 항은 연산하지 않음
		   - 그래서 num1값은 변동되지만 i값은 그대로 출력됨 &&(And), ||(OR) 조건 둘다 동일함
		*/

		System.out.println(value);
		//System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
	}
}