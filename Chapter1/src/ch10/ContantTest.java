package ch10;

public class ContantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;		
		
		//MAX_NUM = 20; 
		/* 이미 위에서 final(상수)로 선언했기 때문에 여기서 사용하면 그냥 일반 
		변수처럼 쓰이는것이 아니라 상수(변하지 않는 수)로 인식 되어 에러가 난다. 
		*/
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
