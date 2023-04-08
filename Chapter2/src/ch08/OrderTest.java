package ch08;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.OrderReceiptNumber = "202011020003";
		order.OrderPhoneNumber = "010-2345-0001";
		order.OrderAddress = "서울시 강남구 역삼동 111-333";
		order.OrderDate = "2020.11.02";
		order.OrderTime = "13.02:58";
		order.OrderPrice = "35,000원";
		order.MenuNumber = "0003";
		
		System.out.println(order.showOrderInfo());

		Privacy privacy = new Privacy();
		privacy.name = "Tomas";
		privacy.age = 37;
		privacy.stature = 180;
		privacy.weight = 78;
		
		System.out.println(privacy.showPrivacy() + privacy.showPrivacyInfo());
		
		
	}
}