package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		/* �ƹ��� ���� �ȵ��������� �ʱ�ȭ�� �����ְ�
		   ������ �Ʒ� �ڵ� ó�� �ۼ��Ѵ�.
		 * �̷��� ���� �ҷ��� ����Ѵٰ� �Ѵ�.
		   �Ȱ��� �ڵ尡 �̹� ������ �ٸ� �����ڸ� �ҷ���,
		   ����������� �������ִ� �ϵ��� �����Ѵ�.
		   (�����ڿ��� �ٸ� �����ڸ� �ҷ��� ����ϴ� ��� �˾Ƶα�!)
		*/
		
		//�ٸ� �����ڸ� ȣ���Ͽ� ����ϴ� this
		 this("no name", 1);
	}
	
	public Person(String name, int age) {
		//�ڱ� �ڽ��� ȣ���ϴ� this
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		//�ڽ��� �ּҸ� ��ȯ�ϴ� this
		return this;
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	/* Ŭ����(��ü�� �����ص� ����)�� ������(������ �ִ� Ŭ����)�� ������
	   �ۼ��ϴ°��� �ǰ�������, �� Ŭ���� ���Ͽ��� ��� �ۼ��ϴ°͵� �����ϴ�.
	*/
	public static void main(String[] args) {
		//�̷��� �����ڸ� ����� �ָ� �⺻ �����ڸ� ȣ���� ���̶�� �Ѵ�.
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		//ch12.Person@2f92e0f4, JVM�� �޸𸮿� �Ҵ����� �ּҰ��� ��µ�
		
		Person person1 = person.getPerson();
		System.out.println(person1);
		//ch12.Person@2f92e0f4, JVM�� �޸𸮿� �Ҵ����� �ּҰ��� ��µ�
		
		/* this�� �����ں��ٴ� ��������� ����ų����
		   �����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ� ���� ����Ѵٰ� �Ѵ�.
		*/
	}
}