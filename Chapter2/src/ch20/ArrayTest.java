package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10]; //10��¥�� 1���� �迭 ����
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++; //++�� �ڿ� ������ ���� �ְ� ���� �����Ѵ�.(���� �������̱� ����)
			
			System.out.println(arr[i]);
		}
		System.out.println(); //�ٹٲ� �뵵�� �ۼ�
		
		/* enhanced for(���� for��) : ó������ ������ ���� ����Ѵ�.
		 * ù ������Ʈ���� n-1��° ������Ʈ���� �� ��ȸ�Ҷ� ����Ѵ�.
		 */
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
	}
}