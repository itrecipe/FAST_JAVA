package ch16;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	//��ü�� �����Ǹ� �ʱ�ȭ �۾��� �����ڿ��� �����Ѵ�.
	public Employee() {
		serialNum++; //�� �ڵ常 ����Ѵٸ� ��� ����� �������Ǿ� 1�� �����ǹ����� ������
		employeeId = serialNum; //���⿡ ��� ������ �����Ѵ�. �׷� employeeId�� ���ذ��� �Ǹ� �ϳ��� ���� ������ �ȴ�.
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