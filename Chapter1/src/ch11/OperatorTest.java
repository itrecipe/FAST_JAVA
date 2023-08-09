package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		/* 제일 많이 사용하게 되는 것들 ++, -- 
		   어느 위치에 있느냐에 따라 수행되는 결과가 다르다. (중요)
		*/
		
		/* 아래 코드와 모두 같은 의미
		   gameScore += 1; gameSocre = gameScore + 1;
		 */
		int lastScore = ++gameScore; //해당 스테이트먼트가 종료되기전에 먼저 +1(증가)을 수행하라는 의미
		
		/*
		int lastScore = gameScore++; //해당 스테이트먼트가 종료된 후 +1(증가)을 수행하라는 의미
		int lastScore = --gameScore; //해당 스테이트먼트가 종료되기전에 먼저 -1(감소)을 수행하라는 의미
		int lastScore = gameScore--; //해당 스테이트먼트가 종료된 후 -1(감소)을 수행하라는 의미
		*/
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
