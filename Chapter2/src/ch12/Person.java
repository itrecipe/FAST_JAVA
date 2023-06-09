package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		/* 아무런 값이 안들어왔을때는 초기화를 시켜주고
		   싶을때 아래 코드 처럼 작성한다.
		 * 이렇게 많이 불러서 사용한다고 한다.
		   똑같은 코드가 이미 있을때 다른 생성자를 불러서,
		   멤버변수들을 셋팅해주는 일들을 수행한다.
		   (생성자에서 다른 생성자를 불러서 사용하는 방법 알아두기!)
		*/
		
		//다른 생성자를 호출하여 사용하는 this
		 this("no name", 1);
	}
	
	public Person(String name, int age) {
		//자기 자신을 호출하는 this
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		//자신의 주소를 반환하는 this
		return this;
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	/* 클래스(객체를 정의해둔 파일)와 구현부(메인이 있는 클래스)를 나눠서
	   작성하는것을 권고하지만, 한 클래스 파일에서 모두 작성하는것도 가능하다.
	*/
	public static void main(String[] args) {
		//이렇게 생성자를 만들어 주면 기본 생성자를 호출한 것이라고 한다.
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		//ch12.Person@2f92e0f4, JVM이 메모리에 할당해준 주소값이 출력됨
		
		Person person1 = person.getPerson();
		System.out.println(person1);
		//ch12.Person@2f92e0f4, JVM이 메모리에 할당해준 주소값이 출력됨
		
		/* this는 생성자보다는 멤버변수를 가르킬때와
		   생성자에서 다른 생성자를 호출할때 많이 사용한다고 한다.
		*/
	}
}