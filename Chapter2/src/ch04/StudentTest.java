package ch04;

public class StudentTest {

	public static void main(String[] args) {
		//Ŭ���� �������, Student(Ŭ����Ÿ��) studentLee(������, �ν��Ͻ�) = new(Ű����) Student(); <- (������)
		Student studentLee = new Student();
		
		//�ν��Ͻ���
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "KIM";
		studentKim.address = "��� ������";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
		
		
	}
}