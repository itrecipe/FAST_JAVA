package ch19;

public class ForTest {

	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		/* for문
		 * 어떤 수를 증감해야 할때, 숫자를 세야할때(카운트를 해야할때)는
		   for문이 효율적이다.
		*/
		for(int i = 0; i < 10; i++, count++) {
			
			sum += count;
		}
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		//while문
		while(num <= 10) {
			total += num++;			
		}
		System.out.println(total);
	}
}