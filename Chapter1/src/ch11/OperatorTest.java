package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		/* ���� ���� ����ϰ� �Ǵ� �͵� ++, -- 
		   ��� ��ġ�� �ִ��Ŀ� ���� ����Ǵ� ����� �ٸ���. (�߿�)
		*/
		
		/* �Ʒ� �ڵ�� ��� ���� �ǹ�
		   gameScore += 1; gameSocre = gameScore + 1;
		 */
		int lastScore = ++gameScore; //�ش� ������Ʈ��Ʈ�� ����Ǳ����� ���� +1(����)�� �����϶�� �ǹ�
		
		/*
		int lastScore = gameScore++; //�ش� ������Ʈ��Ʈ�� ����� �� +1(����)�� �����϶�� �ǹ�
		int lastScore = --gameScore; //�ش� ������Ʈ��Ʈ�� ����Ǳ����� ���� -1(����)�� �����϶�� �ǹ�
		int lastScore = gameScore--; //�ش� ������Ʈ��Ʈ�� ����� �� -1(����)�� �����϶�� �ǹ�
		*/
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
