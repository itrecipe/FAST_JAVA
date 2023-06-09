package ch19;

public class CarFactory {
	
	//유일한 인스턴스, 객체 생성
	private static CarFactory instance = new CarFactory();
	
	//기본 private 생성자
	private CarFactory() {
	
	}
	
	//싱글톤 패턴 사용
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		
	}
}