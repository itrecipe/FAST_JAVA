package ch19;

public class ForTest {

	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		/* for��
		 * � ���� �����ؾ� �Ҷ�, ���ڸ� �����Ҷ�(ī��Ʈ�� �ؾ��Ҷ�)��
		   for���� ȿ�����̴�.
		*/
		for(int i = 0; i < 10; i++, count++) {
			
			sum += count;
		}
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		//while��
		while(num <= 10) {
			total += num++;			
		}
		System.out.println(total);
	}
}