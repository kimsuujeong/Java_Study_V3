package JAVA_240114;

public class NotEmail extends Exception {

	public String NotEmail() {
		return getMessage();
	}

	public NotEmail(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("메일 주소가 입력되지 않았습니다.");
		
	}
}
