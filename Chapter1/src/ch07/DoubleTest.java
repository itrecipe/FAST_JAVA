package ch07;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dnum = 3.14; 
		float fnum = 3.14F; 
		/* 실수는 정수와 다르게 기본적으로 8byte(double) 공간안에 데이터가 
		   잡히기 때문에 float(4byte)형으로 선언시 선언값 뒤에 3.14F 라고
		   적어줘야 4byte 공간에 데이터를 잡을 수 있다.
		   (F는 소문자로 적어줘도 상관없다.)
		*/
		
		System.out.println(dnum);
		System.out.println(fnum);
	}
}
