package JAVA_240111;

public class JAVA_02 {

	// A,E,I,O가 있음
//	public static int A_E_I_O_U(String word) {
	public static void main(String[] args) {
		// 5^1 + 5^2 + 5^3 + 5^4 + 5^5 = 3905
		// A = 0
		// E = (3905/5 + 1)
		// I = ((3905/5) * 2)+ 1 = 1563
		// O = ((3905/5) * 3)+ 1 = 2344
		
		String WORD = "AAAAE";
		String s = "AEIO";
		int cnt = 0;
		int cnt1 = 1;
		int s_ln = s.length()+1;
		
		int sum = 0;
		int a = 0;

		for (int i = 0; i < s_ln; i++) {
			sum += s_ln * Math.pow(s_ln, i);
		}
		
		int first_char = sum/2;
		
		for (String string : s.split("")) {
			a++;
			cnt += (first_char * s.indexOf(WORD.charAt(a)));
		}
		
		System.out.println(first_char);

	}

//	public static void main(String[] args) {
//		
//	}

}
