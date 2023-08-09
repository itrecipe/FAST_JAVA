package ch10;

public class ContantTest {

	public static void main(String[] args) {
		
		/* - 상수 : 변하지 않는 수 
		   	 ex)원주율 3.14, 1년 12개월 등...
		   	 
		   - final(마지막이라는 의미) 예약어를 사용해서 선언한다.
		   
		   - 상수를 사용하면 변하지 않는 값을 반복해서 쓸때 의미있는 문자로 인식하기 쉬우며,
		     혹여나 변하더라도 선언한 부분만 변경해주면 되므로 여러 부분을 수정할 필요가 없다.
		*/
		
		final int MAX_NUM = 100; 
		final int MIN_NUM;
		/* 상수의 경우 다른 변수들과는 차별화를 하기 위해
		   대문자로 선언을 주로 하며, 긴 경우 _를 사용하여 표현한다.
		*/
		
		MIN_NUM = 0;		
		
		//MAX_NUM = 20; 
		/* 이미 위에서 final(상수)로 선언했기 때문에 여기서 사용하면 그냥 일반 
		변수처럼 쓰이는것이 아니라 상수(변하지 않는 수)로 인식 되어 에러가 난다. 
		*/
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
