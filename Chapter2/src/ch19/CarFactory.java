package ch19;

public class CarFactory {
	
	//������ �ν��Ͻ�, ��ü ����
	private static CarFactory instance = new CarFactory();
	
	//�⺻ private ������
	private CarFactory() {
	
	}
	
	//�̱��� ���� ���
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		
	}
}