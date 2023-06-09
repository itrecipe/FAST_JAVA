package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10]; //10개짜리 1차원 배열 생성
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++; //++이 뒤에 있으면 값을 넣고 나서 증가한다.(후위 연산자이기 때문)
			
			System.out.println(arr[i]);
		}
		System.out.println(); //줄바꿈 용도로 작성
		
		/* enhanced for(향상된 for문) : 처음부터 끝까지 돌때 사용한다.
		 * 첫 엘리먼트부터 n-1번째 엘리먼트까지 쭉 순회할때 사용한다.
		 */
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
	}
}