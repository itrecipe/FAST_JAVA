package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		byte byte_Number = -128;
		
		System.out.println(byte_Number);
		
		//int num = 12345678900;
		long long_Number = 123456789L; 
		/* - 12345678900; 해당 숫자는 int(4byte)로 처리하기엔 큰 숫자이기 때문에,
		     8byte인 long형에 넣어줘라 라는 의미이다.
		   
		   - 123456789L : 숫자 뒤에 붙는 L(식별자)이 존재하지 않으면 java는 기본적으로 숫자 값을 int형으로 
		     인식을 해주기 때문에 long타입으로 자동으로 형변환(Auto casting)하라고 명시적으로 작성을 해줘야 한다.
		   
		   - longNumber :
		     (longNumber는 변수이자 실제 값을 의미하는 리터럴 값을 (literal = 값)
		     담는 그릇이라고 생각하면 이해가 쉽다)
		     (즉, longNumber 라는 공간에 123456789L이라는 값을 집어 넣어라 (대입하라) 라는 의미이다.)
		   
		   - 프로그래밍에서 = 은 대입연산자를 의미하며 변수 타입을 선언하고 변수명을 선언하고 리터럴 값을 적으면,
		     우측에서 좌측으로 넘어가면서 값이 대입 된다고 생각하면 된다.
		     (즉, 우측(리터럴 값)을 좌측에 있는 변수라는 공간에 넣는 작업을 수행하고, 해당 변수는 해당하는 값을 가지고 
		     있게 된다는 의미이다.) 
		     
		     ex) int apple = 10; 이라는 예시를 작성해보면 이름이 apple라는 변수라는 공간이 생긴것이고,
		         이때, apple는 10이라는 값을 가지게 된다는 뜻이다.
	 	*/
		System.out.println(long_Number);
	}

}
