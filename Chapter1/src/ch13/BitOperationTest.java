package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		
		int num1 = 5; //00000101 = 5
		int num2 = 10; //00001010 = 10
		
		System.out.println(num1 | num2); //OR
		System.out.println(num1 & num2); //AND
		System.out.println(num1 ^ num2); //XOR(Exclusive OR)
		System.out.println(~num1); //not(������Ʈ, ����)
		
		System.out.println(num1 << 2); //�������� 2��ŭ �б�(�̵�)
		System.out.println(num1 <<= 2); //�������� 2��ŭ �ΰͰ� ����
		System.out.println(num1 >> 1); //���������� 1��ŭ �б� 
		
		/* 2�� n�¸�ŭ <<(�������ų�) >>(�������°�)�� ����Ʈ ������
		   ���ذ� �� �ȵǸ� 8�ڸ� ��Ʈ�� �׸��鼭 ���� ����.
		*/
	}
}