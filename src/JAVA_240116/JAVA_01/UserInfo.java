package JAVA_240116.JAVA_01;

public class UserInfo {
	
	int userId;
	int passWd;
	String userName;
	
	public UserInfo(int userId, int passWd, String userName) {
		super();
		this.userId = userId;
		this.passWd = passWd;
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPassWd() {
		return passWd;
	}
	public void setPassWd(int passWd) {
		this.passWd = passWd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}