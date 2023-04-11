package ch09;

public class Student {

	int studentId;
	String studentName;
	
	//�����ڷ���
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		/* �����ڷ����� �׳� ���°� �ƴ϶� �Ʒ� �ڵ�ó�� �����ؼ� ����Ѵ�.
		 * �и��ϴ� ������ ������ ��ü�� ��Ȱ�� ����� �и��ϰ� �ϱ� ���� ����Ѵ�.
		 * �׸��� DB�͵� �������� �־ �̷��� ����ϴ� ����� �ִٴ°��� �˾Ƶ���
		 */
		korea = new Subject();
		math = new Subject();
	}
	
	//��� ������ ���� ����
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	//������ ����ؼ� ���
	public void showScoreInfo() {
		
		int total = korea.score + math.score;
		System.out.println(studentName + "�л��� ������ " + total + "�� �̴�.");
	}
}