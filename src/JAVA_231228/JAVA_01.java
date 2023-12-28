package JAVA_231228;

public class JAVA_01 {

	static boolean quiz(String n) {
		// 다 소문자로 바꿔준다
		n = n.toLowerCase();
		
		boolean answer = true;
		
		// ex) n길이 10 - c를 뺀 나머지 길이가 8이라면 = 2 즉 2는 c의 숫자
		int cCnt = n.length() - n.replace("c", "").length(); // c count
		int gCnt = n.length() - n.replace("g", "").length(); // g count
		
		 if(cCnt == gCnt) {
	            answer = true;
	        } else {
	            answer = false;
	        }
		
		return answer;

	}

	public static void main(String[] args) {

		System.out.println("quiz\tanswer");
		System.out.print("gGoocCo\t");
		System.out.println(quiz("gGoocCo"));
		System.out.print("Gcc  \t");
		System.out.println(quiz("Gcc"));

		// 결과
		// quiz answer
		// gGoocCo ture --> g가2개 c가 두개라 ㅇㅋ
		// Gcc flase --> G갯수가 다름

	}

}
