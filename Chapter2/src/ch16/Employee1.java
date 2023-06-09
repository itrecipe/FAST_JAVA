package ch16;

public class Employee1 {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public static int getSerialNum() {
		
		int i = 0; 
		/* 함수 내부에 선언된 지역변수이며 사용가능하다.
		   지역 변수는 인스턴스 변수(멤버변수)와는 상관없이
		   해당 메서드 내부에서 사용되기 때문이다.
		 */
		
		//인스턴스(멤버) 변수
		//employeeName = "Lee"; 
		/* 여기서는 일반 멤버변수를 사용할 수 없다.
		   이유는 getSerialNum() 메서드가 호출될 시점에
		   employeeName 이라는 인스턴스 변수가 없을수 있기 때문이다.
		 */
		
		//static변수
		return serialNum;
	}

	public int getEmployeeId() {
		serialNum = 1000; 
		/* 위 코드처럼 static이 아닌 일반 메서드에서 static 변수를 사용하는것은 문제가 없다.
		   이유는 이미 메모리에 로드된 상태이기 때문이다.
		 */
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}