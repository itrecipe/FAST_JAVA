package ch12;

public class LogicalTest1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		//boolean value1 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		
		/* - 앞의 항이 이미 false이므로 컴퓨터는 더이상 뒤의 항은 연산하지 않음
		   - 그래서 num1값은 변동되지만 i값은 그대로 출력됨 &&, || 조건 둘다 동일함
		*/

		System.out.println(value);
		//System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
	}
}