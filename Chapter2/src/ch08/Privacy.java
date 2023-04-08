package ch08;

public class Privacy {

	public String name;
	public int age;
	public int stature;
	public int weight;
	
	public Privacy() {
		super();
	}

	public Privacy(String name, int age, int stature, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.stature = stature;
		this.weight = weight;
	}
	
	public String showPrivacy() {
		return "고객명 : " + name;
	}
	
	public String showPrivacyInfo() {
		
		return " 나이 : " + age + " 키 : " + stature + " 몸무게 : " + weight + " 입니다";
	}
	
	
	
}
