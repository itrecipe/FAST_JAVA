package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		var i = 10; //타입 var는 variable의 약자이며, 변수 i는 정수형(int)이이라는것을 추론할 수 있다.
		var j = 10.0; //j는 실수형(double)로 추론가능
		var str = "test"; //str은 "test"라는 문자열이 들어가겠구나 하고 추론가능
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str; 
		/* 위에서 str변수에 test라는 값을 대입하였으므로
		str2의 값도 test가 된다.
		*/
		System.out.println(str2);
		
		str = "hello";
	}

}
