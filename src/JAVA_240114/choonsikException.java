package JAVA_240114;

public class choonsikException extends Exception {

	public String choonsikException() {
		return getMessage();
	}
	
	public choonsikException(String string, String name) {
		// TODO Auto-generated constructor stub
		System.out.printf("%s는 관리자가 아닙니다.\n", name);
	}

}
