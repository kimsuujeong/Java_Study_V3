package JAVA_240110.OOP;

public class JAVA_02 {
	
	public static String n_time (String my_string, int n) {
		
		String answer = "";
		
		for (int i = 0; i < my_string.length(); i++) {           
			for (int j = 1; j <= n; j += 1) {
			      answer += my_string.charAt(i);
			    }
			}
		
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(n_time("hello", 3));
		
		//my_string		n	result
		//"hello"		3	"hhheeellllllooo"
		
	}

}
