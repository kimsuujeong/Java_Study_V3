package JAVA_240117;

public class ExceptionExam {
	
	public static void main(String[] args) {
		
		try {
			int gunchim = 10/0;
			System.out.println(gunchim);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}
	
}
