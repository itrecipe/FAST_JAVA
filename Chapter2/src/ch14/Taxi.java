package ch14;

public class Taxi {
	
	String taxiCompany; //�ý�ȸ��(�����)
	int money; //���
	
	//�ý� �⺻ ������
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	//�л��� �ýø� Ÿ�� ������
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompany + " ������ " + money + "�� �̴�.");
	}
}