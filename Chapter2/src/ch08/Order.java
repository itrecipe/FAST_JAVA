package ch08;

public class Order {

//	## ���� ������ �ش�Ǵ� ��ü�� �����ϰ� �ش� ������ ����� ������
//
//	1. Ű�� 180 �̰� �����԰� 78 ų���� ������ �ֽ��ϴ�. �̸��� Tomas �̰� ���̴� 37���Դϴ�.
//
//	2. �������� ��� �ֹ��� ���Խ��ϴ�.
//	       
//	       �ֹ� ���� ��ȣ : 202011020003
//	       �ֹ� �ڵ��� ��ȣ : 01023450001
//	       �ֹ� �� �ּ� : ����� ������ ���ﵿ 111-333
//	       �ֹ� ��¥ : 20201102
//	       �ֹ� �ð� : 130258
//	       �ֹ� ���� : 35000
//	       �޴� ��ȣ : 0003
	       
	public String OrderReceiptNumber;
	public String OrderPhoneNumber;
	public String OrderAddress;
	public String OrderDate;
	public String OrderTime;
	public String OrderPrice;
	public String MenuNumber;

	public Order() {
		super();
	}

	public Order(String orderReceiptNumber, String orderPhoneNumber, String orderAddress, String orderDate,
			String orderTime, String orderPrice, String menuNumber) {
		super();
		OrderReceiptNumber = orderReceiptNumber;
		OrderPhoneNumber = orderPhoneNumber;
		OrderAddress = orderAddress;
		OrderDate = orderDate;
		OrderTime = orderTime;
		OrderPrice = orderPrice;
		MenuNumber = menuNumber;
	}
	
	public String showOrderInfo() {
		return "������ �ֹ� ���� ��ȣ�� " + OrderReceiptNumber + "�Դϴ�. �ڵ��� ��ȣ��" 
				+ OrderPhoneNumber + "�Դϴ�. �ֹ� ���� ��ȣ�� " + OrderAddress + "�Դϴ�. �ֹ����ڴ� " + OrderDate 
				+ "�Դϴ�. �ֹ� �ð��� " + OrderTime + "�Դϴ�. �ֹ� ������ " + OrderPrice + "�Դϴ�. �޴� ��ȣ�� " 
				+ MenuNumber + "�Դϴ�.";
	}

}
