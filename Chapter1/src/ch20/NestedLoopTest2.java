package ch20;

public class NestedLoopTest2 {
	//while ��ø �ݺ���
	public static void main(String[] args) {
		
		int dan = 2;
		int count = 1;

		while(dan <= 9) {
			
			count = 1;
			while(count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}
}