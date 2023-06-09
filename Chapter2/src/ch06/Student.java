package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	/* default생성자는 생성자가 하나도 없을시 만들어준다.
	 * 필요하면 이렇게 직접 넣어서 사용해도 되며,
	 * 경우에 따라서는 제공하지 않는 경우도 있다.(문제가 있는 경우 꼭 제공하지 않아도 된다고 한다.)
	 */
	
	//default constructor(기본 생성자)
	public Student() { 
		
	}
	
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		/* 내가 만든 멤버변수(매개변수, 파라미터)에 넘어온 값을 생성자에 대입해주는것이 생성자의 역할이므로
		 * 이때, 사용하는 키워드가 this이다.
		 */
	}
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은? " + studentNumber + "이고, " + grade + "학년 이다.";
	}

}