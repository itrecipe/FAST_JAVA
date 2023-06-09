package ch16;

public class EmployeeTest1 {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(Employee1.getSerialNum()); 
		/* 해당 코드에서 노란줄이 뜨는 이유는 serialNum은 이미 메모리에 올라와있는
		   static(동적할당)된 변수 이기 때문에 클래스명으로 불러서 사용할 수가 있다.
		   employeeLee라는 인스턴스 변수로 호출 할 수도 있지만 클래스명으로 호출하는
		   방법을 제일 많이 사용 한다고 한다.
		 */
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		//두개의 인스턴스가 하나의 메모리를 공유하고 있다. 
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은? " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은? " + employeeKim.getEmployeeId());
	}
}