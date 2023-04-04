package ch04;

public class StudentTest {

	public static void main(String[] args) {
		//클래스 생성방법, Student(클래스타입) studentLee(변수명, 인스턴스) = new(키워드) Student(); <- (생성자)
		Student studentLee = new Student();
		
		//인스턴스들
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "KIM";
		studentKim.address = "경기 성남시";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
		
		
	}
}