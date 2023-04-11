package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100); //100�� ���� ��ü ����
		Bus bus500 = new Bus(500); //500�� ���� ��ü ����
		studentJ.takeBus(bus100); //studentJ�� 100�� ���� ž��
		
		Subway greenSubway = new Subway(2); //2������ �ʷϻ� ����ö ��ü ����
		studentT.takeSubway(greenSubway); //�ʷϻ�(2������) ����ö ž��
		
		studentJ.showInfo();
		studentT.showInfo();
		System.out.println();
		bus100.showBusInfo();
		greenSubway.showSubInfo();
		bus500.showBusInfo();

		Student studentE = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("�� ������ ��� (�ý�) : ");
		studentE.takeTaxi(taxi);
		studentE.showInfo();
		taxi.showTaxiInfo();
	}
}