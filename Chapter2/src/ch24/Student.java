package ch24;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	//학생이 어떤 과목을 수강했는지 입력 해주는 메서드
	public void addSubject(String name, int point) {
		
		//객체 생성
		Subject subject = new Subject();
		subject.setName(name); //name값을 꺼내오기
		subject.setScorePoint(point); // point값을 꺼내오기
		
		subjectList.add(subject);
	}
	
	//총점을 계산해서 출력
	//과목과 성적을 출력
	public void showScoreInfo() {
		int total = 0; //total은 합계를 나타낼 변수
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + "이다.");
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 이다.");
	}
}
