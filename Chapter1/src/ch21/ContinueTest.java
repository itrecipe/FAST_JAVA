package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int num;
		
		for(num = 1; num<=100; num++) {
			//num�� 3���� �������� 0�� �ƴѰ��� ��, 3�� ������ �ǹ�
			if((num % 3) != 0) continue;

			System.out.println(num);
		}
	}
}