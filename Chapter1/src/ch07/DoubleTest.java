package ch07;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dnum = 3.14; 
		float fnum = 3.14F; 
		/* �Ǽ��� ������ �ٸ��� �⺻������ 8byte(double) �����ȿ� �����Ͱ� 
		   ������ ������ float(4byte)������ ����� ���� �ڿ� 3.14F ���
		   ������� 4byte ������ �����͸� ���� �� �ִ�.
		   (F�� �ҹ��ڷ� �����൵ �������.)
		*/
		
		System.out.println(dnum);
		System.out.println(fnum);
	}
}
