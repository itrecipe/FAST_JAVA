package ch08;

public class CharaterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); 
		System.out.println((int)ch1); //�ƽ�Ű�ڵ�� A�� 65
		/* 'A'�� 65�� �ٲ�� ������ ���ڵ�, 
		   65�� A�� �ٲ�� ������ ���ڵ� �̶�� �Ѵ�.
		*/
		
		char ch2 = 66;
		/* - char��� �ڷ����� ���������� 2byte�� ����ϸ�,
		   �ش�Ǵ� �ڵ尪(������)�� ���� �ִ�.)
		   
		   - ������ ���Ұ�, ����� ��밡��
		*/
		System.out.println(ch2);
		System.out.println((char)ch2); //�ش� ���� ĳ������ �ǹ̰� ����
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '��';
		char ch = '\uD55C'; //'\uD55C' -> �����ڵ尪
		System.out.println(han);
		System.out.println(ch);
		
		/* �������
		  - character set : ���ָ� ���ڷ� ��ȯ�� ���� ��Ʈ
		  - encoding : ���ڸ� ���ڷ� ��ȯ�� ��
		  - decoding : ���ڿ��� �ٽ� ���ڷ� ��ȯ�� ��
		  - ASCII code : ���ĺ�, ����, Ư�� ���ڵ��� 1����Ʈ�� ǥ���Ҷ� ����ϴ� ���ڼ�Ʈ
		  - UNICODE : �� ���� ǥ������ ���� ���� ��Ʈ
		  - UTF-8 : �� ���� ǥ������ ���� ���� ��Ʈ
		  - UTF-16 : 2byte�� ���� ǥ��
		*/
	}

}