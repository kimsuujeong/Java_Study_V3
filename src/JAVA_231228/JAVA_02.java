package JAVA_231228;

public class JAVA_02 {

	// 제이든 케이스 --> 첫 문자가 대문자이며, 그 외 알파벳은 소문자다

	// "" 공백의 앞자리를 찾아서 그 앞을 toUppercase();라는 것으로 바꿔주고 나머지를 toLowercase();

	static String upperAndLwer(String n) {
		
		// StringBuilder -> 문자열 합치기
		StringBuilder sb = new StringBuilder();
		String firstStr = n.charAt(0) + ""; //공백을 기준으로 담아준다.
		
		
		sb.append(firstStr.toUpperCase()); //첫 번째 문장은 대문자로 바꿔준다.

		for (int i = 1; i < n.length(); i++) {
			
		      String string = n.charAt(i) + ""; 
		      
		      if (string.equals(' ')) { // 공백이면 그대로 넘어가기
		    	  
		        sb.append(" ");
		        
		      } else if (n.charAt(i - 1) == ' ') { // 문자열 전 지정
		    	  
		        sb.append(string.toUpperCase()); // 대문자
		        
		      } else {
		    	  
		        sb.append(string.toLowerCase()); // 소문자
		        
		      }
		    }

		    return sb.toString();
		  }


	// s길이 1~200
	// s길이는 알파벳과 숫자, 공백("")로 이루어져 있다.

	public static void main(String[] args) {

		System.out.println("s\t\t\treturn");
		System.out.print("\"3people unFollowed me\"\t\t");
		System.out.println(upperAndLwer("3people unFollowed me"));
		System.out.print("\"for the last week\"\t\t");
		System.out.println(upperAndLwer("for the last week"));

		/*
		 * s return "3people unFollowed me" "3people Unfollowed Me" "for the last week"
		 * "For The Last Week"
		 */

	}

}
