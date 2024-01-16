package JAVA_240114;

public class JAVA_03 {

	String author;
	String content;

	public static void main(String[] args) {

		JAVA_03 comment1 = new JAVA_03();
		
		Comment(comment1.author="", comment1.content="");

	}

	public static void Comment(String author, String content) {

		try {
			if (content == "") {
				throw new EmptyContentException(content);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

class EmptyContentException extends Exception{
	
	public String EmptyContentException() {
		return getLocalizedMessage();
	}
	
	public EmptyContentException(String content) {
		System.out.println("아따 댓글도 좀 써주쇼잉");
	}
	
}