package ch10;

public class BirthDay {
	
	/* private를 사용했으므로 외부에서 접근 불가 (캡슐화 = "정보의 은닉화")
	 * integer는 default값을 가지는데  0을 갖게된다.
	 * private은 변수로는 값을 지정할수 없다.
	 * private을 사용하면 객체를 사용할때 오류를 막을수 있고,
	   디버깅도 편리해지며, 잘못 사용되는 경우 또는 
	   잘못된 접근의 경우를 막을수 있다.
	 */
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; //true인지 flase인지만 갖고 있는 멤버변수
	//default 값을 가지는데 boolean형은 false를 갖게된다.
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	//get() 값을 가져오고, set() 값을 꺼내온다.
	//getter, setter 메서드 사용(이클립스에서 제공하는 기능)
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
			System.out.println(year + "년 " + month + "월 " + day + "일 이다.");
		}
		else {
			System.out.println("유효하지 않은 날짜!");
		}
	}
	
	/* read only 속성 예시 : 값을 읽을순 있으나, 가져갈 수는 없다.
	   이유는 set() 메서드를 제공하지 않으며, 외부에서 알려지지 않게끔 하기
	   위해서인듯 하다.(정보를 보호해야 하기 때문인것 같다.)
	*/
	public boolean getisValid() {
		return isValid;
	}
}