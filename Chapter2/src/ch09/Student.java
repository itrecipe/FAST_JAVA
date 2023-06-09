package ch09;

public class Student {

	int studentId;
	String studentName;
	
	//참조자료형
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		/* 참조자료형은 그냥 쓰는게 아니라 아래 코드처럼 생성해서 사용한다.
		 * 분리하는 이유는 각각의 객체의 역활과 기능을 분명하게 하기 위해 사용한다.
		 * 그리고 DB와도 연관성이 있어서 이렇게 사용하는 방법도 있다는것을 알아두자
		 */
		korea = new Subject();
		math = new Subject();
	}
	
	//멤버 변수에 대한 셋팅
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	//총점을 계산해서 출력
	public void showScoreInfo() {
		
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 이다.");
	}
}
