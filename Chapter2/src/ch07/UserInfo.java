package ch07;

public class UserInfo {
	
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {
		super();
		
	}

	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showuserInfo() {
		return "������ ���̵�� " + userId + "�̰�, ��ϵ� �̸��� " + userName + "�̴�.";
	}
	
}