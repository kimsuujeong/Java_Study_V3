package JAVA_240114;

public class InvalidEmailException extends Exception {

	public String InvalidEmailException() {
		return getMessage();
		
	}
	public InvalidEmailException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("아따 메일 주소가 잘못 됐소");
		
	}

}
