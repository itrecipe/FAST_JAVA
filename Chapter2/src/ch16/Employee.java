package ch16;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	//객체가 생성되면 초기화 작업은 생성자에서 지원한다.
	public Employee() {
		serialNum++; //이 코드만 사용한다면 모든 사번이 공유가되어 1씩 증가되버리기 때문에
		employeeId = serialNum; //여기에 멤버 변수를 복사한다. 그럼 employeeId가 기준값이 되며 하나씩 각자 가지게 된다.
	}
	
	public int getEmployeeId() {
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