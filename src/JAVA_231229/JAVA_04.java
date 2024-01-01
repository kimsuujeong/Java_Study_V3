package JAVA_231229;

public class JAVA_04 { // 문제2
	
	static int compare(int n, int b) {
		
		int answer = 0;
		
		answer = (n > b) ? n : b;
		
		return answer;

	}
	
	public static void main(String[] args) {
		
		System.out.println(compare(5, 13));
		
	}

}
