package ch04;

public class Student {
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "학번 이름은? " + studentName + " 이고, 주소는? " + address + "이다.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}
