package ch18;

public class Company {
	//싱글톤 패턴 : 유일한 객체를 제공할때 사용한다.
	
	//유일한 인스턴스, 객체 생성
	private static Company instance = new Company();
	
	/* 생성자를 마음대로 new키워드를 이용해서 생성하여
	   사용하지 못하도록 private 메서드를 생성함
	*/
	private Company() {
		
	}
	
	//싱글톤 패턴
	public static Company getInstance() {
		//방어적인 코드
		if(instance == null) {
			instance = new Company();
		}
			
		return instance;
	}
}