package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		/*
		int iNum = 255;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		*/
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum; 
		/* 해당 경우는 dNum과 fNum을 강제 형변환 하면서
		   실수부 값들이 모두 잘린다. 그래서 1 + 0 = 1의
		   결과값이 출력 된다.
		 */
		
		int iNum2 = (int)(dNum + fNum); 
		/* 여기서는 1.2 + 0.9 = 2.1 연산이 먼저 수행되며,
		   int형으로 형변환(AutoCasting) 되면서 실수부는 잘리게 된다.
		   그래서 결과값은 2로 출력이 된다.
		*/
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}