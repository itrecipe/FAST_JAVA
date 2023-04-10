package ch14;

public class Taxi {
	
	String taxiCompany; //택시회사(운수명)
	int money; //요금
	
	//택시 기본 생성자
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	//학생이 택시를 타는 생성자
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompany + " 수입은 " + money + "원 이다.");
	}
}