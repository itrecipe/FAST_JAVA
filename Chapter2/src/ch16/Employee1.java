package ch16;

public class Employee1 {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public static int getSerialNum() {
		
		int i = 0; 
		/* �Լ� ���ο� ����� ���������̸� ��밡���ϴ�.
		   ���� ������ �ν��Ͻ� ����(�������)�ʹ� �������
		   �ش� �޼��� ���ο��� ���Ǳ� �����̴�.
		 */
		
		//�ν��Ͻ�(���) ����
		//employeeName = "Lee"; 
		/* ���⼭�� �Ϲ� ��������� ����� �� ����.
		   ������ getSerialNum() �޼��尡 ȣ��� ������
		   employeeName �̶�� �ν��Ͻ� ������ ������ �ֱ� �����̴�.
		 */
		
		//static����
		return serialNum;
	}

	public int getEmployeeId() {
		serialNum = 1000; 
		/* �� �ڵ�ó�� static�� �ƴ� �Ϲ� �޼��忡�� static ������ ����ϴ°��� ������ ����.
		   ������ �̹� �޸𸮿� �ε�� �����̱� �����̴�.
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