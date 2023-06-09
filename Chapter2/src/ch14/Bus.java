package ch14;

public class Bus {

	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 수입

	// 버스의 기본 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 버스를 탄 메서드(객체간의 협력이 되는 메서드)
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showBusInfo() {
		System.out.println(busNumber + " 번의 승객 수는 " + passengerCount + "명 이며, 수입은 " + money + "원 이다.");
	}
}