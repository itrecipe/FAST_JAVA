package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		var i = 10; //Ÿ�� var�� variable�� �����̸�, ���� i�� ������(int)���̶�°��� �߷��� �� �ִ�.
		var j = 10.0; //j�� �Ǽ���(double)�� �߷а���
		var str = "test"; //str�� "test"��� ���ڿ��� ���ڱ��� �ϰ� �߷а���
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str; 
		/* ������ str������ test��� ���� �����Ͽ����Ƿ�
		str2�� ���� test�� �ȴ�.
		*/
		System.out.println(str2);
		
		str = "hello";
	}

}
