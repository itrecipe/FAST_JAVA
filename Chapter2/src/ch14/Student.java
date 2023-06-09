package ch14;

public class Student {
	String studentName;
	int money;
	
	/* 생성자는 앞에 키워드를 빼고 작성할 수 있으며,
	   빼고 작성하면 디폴트 생성자라고 한다.
	 * 같은 패키지 내부에서만 접근이 가능하다.
	 */
	
	//학생 생성자를 생성
	public Student(String studentname, int money) {
		this.studentName = studentname;
		this.money = money;
	}
	
	//학생이 타는 버스 생성자
	public void takeBus(Bus bus) { 
		//학생이 탄 버스가 뭔지 알려주기위해 매개변수로 Bus객체와 bus 매개변수를 집어넣음
		bus.take(1000); //버스를 탔을때 1000원을 지불하고
		this.money -= 1000; //그럼 현재 내가 가진돈도 1000원이 줄어야 한다.
	}
	
	//학생이 타는 지하철 생성자
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	//학생이 타는 택시 생성자
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은? " + money + " 원 이다.");
	}
}
