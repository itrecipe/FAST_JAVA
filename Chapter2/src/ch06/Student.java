package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student(int studentNumber, String studentName, int grade) {
		System.out.println("student 생성");
	}
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은? " + studentNumber + "이고, " + grade + "학년 이다.";
	}

}