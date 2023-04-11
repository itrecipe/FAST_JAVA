package ch14;

public class Student {
	String studentName;
	int money;
	
	/* �����ڴ� �տ� Ű���带 ���� �ۼ��� �� ������,
	   ���� �ۼ��ϸ� ����Ʈ �����ڶ�� �Ѵ�.
	 * ���� ��Ű�� ���ο����� ������ �����ϴ�.
	 */
	
	//�л� �����ڸ� ����
	public Student(String studentname, int money) {
		this.studentName = studentname;
		this.money = money;
	}
	
	//�л��� Ÿ�� ���� ������
	public void takeBus(Bus bus) { 
		//�л��� ź ������ ���� �˷��ֱ����� �Ű������� Bus��ü�� bus �Ű������� �������
		bus.take(1000); //������ ������ 1000���� �����ϰ�
		this.money -= 1000; //�׷� ���� ���� �������� 1000���� �پ�� �Ѵ�.
	}
	
	//�л��� Ÿ�� ����ö ������
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	//�л��� Ÿ�� �ý� ������
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����? " + money + " �� �̴�.");
	}
}