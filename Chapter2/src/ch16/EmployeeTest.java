package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		/* �����ڰ� �ϳ��� ������ �⺻ �����ڰ� �ڵ����� �������
		 * �ش� ���Ͽ����� �⺻ �����ڸ� �̿��� ����
		 */
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
		
		System.out.println(employeeLee.serialNum); 
		/* �ش� �ڵ忡�� ������� �ߴ� ������ serialNum�� �̹� �޸𸮿� �ö���ִ�
		   static(�����Ҵ�) ���� �̱� ������ Ŭ���������� �ҷ��� ����� ���� �ִ�.
		   employeeLee��� �ν��Ͻ� ������ ȣ�� �� ���� ������ Ŭ���������� ȣ���ϴ�
		   ����� ���� ���� ��� �Ѵٰ� �Ѵ�.
		 */
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		//�ΰ��� �ν��Ͻ��� �ϳ��� �޸𸮸� �����ϰ� �ִ�. 
		System.out.println(employeeLee.getEmployeeName() + "���� �����? " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "���� �����? " + employeeKim.getEmployeeId());
	}
}