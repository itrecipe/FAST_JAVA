package ch10;

public class BirthDay {
	
	/* private�� ��������Ƿ� �ܺο��� ���� �Ұ� (ĸ��ȭ = "������ ����ȭ")
	 * integer�� default���� �����µ�  0�� ���Եȴ�.
	 * private�� �����δ� ���� �����Ҽ� ����.
	 * private�� ����ϸ� ��ü�� ����Ҷ� ������ ������ �ְ�,
	   ����뵵 ����������, �߸� ���Ǵ� ��� �Ǵ� 
	   �߸��� ������ ��츦 ������ �ִ�.
	 */
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; //true���� flase������ ���� �ִ� �������
	//default ���� �����µ� boolean���� false�� ���Եȴ�.
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	//get() ���� ��������, set() ���� �����´�.
	//getter, setter �޼��� ���(��Ŭ�������� �����ϴ� ���)
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		} else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "�� " + month + "�� " + day + "�� �̴�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥!");
		}
	}
	
	/* read only �Ӽ� ���� : ���� ������ ������, ������ ���� ����.
	   ������ set() �޼��带 �������� ������, �ܺο��� �˷����� �ʰԲ� �ϱ�
	   ���ؼ��ε� �ϴ�.(������ ��ȣ�ؾ� �ϱ� �����ΰ� ����.)
	*/
	public boolean getisValid() {
		return isValid;
	}
}