package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	/* default�����ڴ� �����ڰ� �ϳ��� ������ ������ش�.
	 * �ʿ��ϸ� �̷��� ���� �־ ����ص� �Ǹ�,
	 * ��쿡 ���󼭴� �������� �ʴ� ��쵵 �ִ�.(������ �ִ� ��� �� �������� �ʾƵ� �ȴٰ� �Ѵ�.)
	 */
	
	//default constructor(�⺻ ������)
	public Student() { 
		
	}
	
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		/* ���� ���� �������(�Ű�����, �Ķ����)�� �Ѿ�� ���� �����ڿ� �������ִ°��� �������� �����̹Ƿ�
		 * �̶�, ����ϴ� Ű���尡 this�̴�.
		 */
	}
	public String showStudentInfo() {
		
		return studentName + "�л��� �й���? " + studentNumber + "�̰�, " + grade + "�г� �̴�.";
	}

}