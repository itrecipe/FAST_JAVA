package ch08;

public class CharaterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); 
		System.out.println((int)ch1); //아스키코드로 A는 65
		/* 'A'가 65로 바뀌는 과정은 인코딩, 
		   65가 A로 바뀌는 과정을 디코딩 이라고 한다.
		*/
		
		char ch2 = 66;
		/* - char라는 자료형은 내부적으로 2byte를 사용하며,
		   해당되는 코드값(정수값)을 갖고 있다.)
		   
		   - 음수는 사용불가, 양수만 사용가능
		*/
		System.out.println(ch2);
		System.out.println((char)ch2); //해당 경우는 캐스팅이 의미가 없음
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '한';
		char ch = '\uD55C'; //'\uD55C' -> 유니코드값
		System.out.println(han);
		System.out.println(ch);
		
		/* 참고사항
		  - character set : 문주를 숫자로 변환한 값의 세트
		  - encoding : 문자를 숫자로 변환한 것
		  - decoding : 숫자에서 다시 문자로 변환한 것
		  - ASCII code : 알파벳, 숫자, 특수 문자들을 1바이트로 표현할때 사용하는 문자세트
		  - UNICODE : 전 세계 표준으로 만든 문자 세트
		  - UTF-8 : 전 세계 표준으로 만든 문자 세트
		  - UTF-16 : 2byte로 문자 표현
		*/
	}

}