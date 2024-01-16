package JAVA_240114;

public class NotAdress extends Exception {

	public String NotAdress() {
		return getMessage();
	}
	
	public NotAdress(String mail) {
		// TODO Auto-generated constructor stub
		System.out.println("없는 이메일 주소값 입니다.");
	}

}
