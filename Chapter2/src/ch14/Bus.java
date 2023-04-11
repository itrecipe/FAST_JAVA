package ch14;

public class Bus {

	int busNumber; // ���� ��ȣ
	int passengerCount; // �°� ��
	int money; // ����

	// ������ �⺻ ������
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// ������ ź �޼���(��ü���� ������ �Ǵ� �޼���)
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showBusInfo() {
		System.out.println(busNumber + " ���� �°� ���� " + passengerCount + "�� �̸�, ������ " + money + "�� �̴�.");
	}
}