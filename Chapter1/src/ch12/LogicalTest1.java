package ch12;

public class LogicalTest1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		//boolean value1 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		
		/* - ���� ���� �̹� false�̹Ƿ� ��ǻ�ʹ� ���̻� ���� ���� �������� ����
		   - �׷��� num1���� ���������� i���� �״�� ��µ� &&, || ���� �Ѵ� ������
		*/

		System.out.println(value);
		//System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
	}
}