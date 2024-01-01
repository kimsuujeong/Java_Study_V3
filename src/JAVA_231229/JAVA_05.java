package JAVA_231229;

public class JAVA_05 {

	static char changeChar(char n) {
		// TODO Auto-generated method stub
		
		int num = (int)n;
		
		if (65 <= num && num >= 90) {
			num -= 32;
		}
		else {
			num += 32;
		}
		
		char answer = (char) num;
		
		return answer;

	}

	public static void main(String[] args) {

		System.out.println(changeChar('a'));
		System.out.println(changeChar('A'));

	}

}
