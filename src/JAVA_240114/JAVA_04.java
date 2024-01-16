package JAVA_240114;

public class JAVA_04 {

	String name;
	int score;

	public static void main(String[] args) {
		JAVA_04 student1 = new JAVA_04();

		Student(student1.name = "김수정", student1.score = 300);

	}

	public static void Student(String name, int score) {

		try {
			if (score < 0 || score > 100) {
				
				throw new InvalidScoreException();
				
			}
		} catch (Exception e) {
			System.out.println("유효하지 않은 점수입니다.");
		}
	
	}

}

class InvalidScoreException extends Exception{
	
	public InvalidScoreException() {
		
	}
	
	public String InvalidScoreException() {
		return getMessage();
	}
	
}