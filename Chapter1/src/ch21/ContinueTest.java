package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int num;
		
		for(num = 1; num<=100; num++) {
			//num을 3으로 나눈값이 0이 아닌값은 즉, 3의 배수라는 의미
			if((num % 3) != 0) continue;

			System.out.println(num);
		}
	}
}