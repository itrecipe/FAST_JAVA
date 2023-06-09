package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100); //100번 버스 객체 생성
		Bus bus500 = new Bus(500); //500번 버스 객체 생성
		studentJ.takeBus(bus100); //studentJ가 100번 버스 탑승
		
		Subway greenSubway = new Subway(2); //2번라인 초록색 지하철 객체 생성
		studentT.takeSubway(greenSubway); //초록색(2번라인) 지하철 탑승
		
		studentJ.showInfo();
		studentT.showInfo();
		System.out.println();
		bus100.showBusInfo();
		greenSubway.showSubInfo();
		bus500.showBusInfo();

		Student studentE = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("잘 나간다 운수 (택시) : ");
		studentE.takeTaxi(taxi);
		studentE.showInfo();
		taxi.showTaxiInfo();
	}
}