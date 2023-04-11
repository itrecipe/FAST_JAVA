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
	
	//�л��� � ������ �����ߴ��� �Է� ���ִ� �޼���
	public void addSubject(String name, int point) {
		
		//��ü ����
		Subject subject = new Subject();
		subject.setName(name); //name���� ��������
		subject.setScorePoint(point); // point���� ��������
		
		subjectList.add(subject);
	}
	
	//������ ����ؼ� ���
	//����� ������ ���
	public void showScoreInfo() {
		int total = 0; //total�� �հ踦 ��Ÿ�� ����
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println(studentName + "�л��� " + subject.getName() + " ������ ������ " + subject.getScorePoint() + "�̴�.");
		}
		System.out.println(studentName + "�л��� ������ " + total + "�� �̴�.");
	}
}