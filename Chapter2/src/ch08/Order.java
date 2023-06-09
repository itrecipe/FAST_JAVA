package ch08;

public class Order {

//	## 다음 설명에 해당되는 객체를 구현하고 해당 정보를 출력해 보세요
//
//	1. 키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
//
//	2. 음식점에 배달 주문이 들어왔습니다.
//	       
//	       주문 접수 번호 : 202011020003
//	       주문 핸드폰 번호 : 01023450001
//	       주문 집 주소 : 서울시 강남구 역삼동 111-333
//	       주문 날짜 : 20201102
//	       주문 시간 : 130258
//	       주문 가격 : 35000
//	       메뉴 번호 : 0003
	       
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
		return "고객님 주문 접수 번호는 " + OrderReceiptNumber + "입니다. 핸드폰 번호는" 
				+ OrderPhoneNumber + "입니다. 주문 접수 번호는 " + OrderAddress + "입니다. 주문일자는 " + OrderDate 
				+ "입니다. 주문 시간은 " + OrderTime + "입니다. 주문 가격은 " + OrderPrice + "입니다. 메뉴 번호는 " 
				+ MenuNumber + "입니다.";
	}

}

