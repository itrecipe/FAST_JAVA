package ch08;

public class CharaterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2); //해당 경우는 캐스팅이 의미가 없음
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '한';
		char ch = '\uD55C'; //'\uD55C' -> 유니코드값
		System.out.println(han);
		System.out.println(ch);
	}

}