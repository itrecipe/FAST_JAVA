package ch19;

public class Car {
	private static int carSerealNum = 10001;
	
	private int carNum;
	
	public Car() {
		
	}

	public static int getCarSerealNum() {
		return carSerealNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}