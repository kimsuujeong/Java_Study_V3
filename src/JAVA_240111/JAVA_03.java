package JAVA_240111;

import java.util.Arrays;

public class JAVA_03 {
	
	 public static String solution(String[] friends, String[] gifts) {
	        int answer = 0;
	        String S_gifts = Arrays.toString(gifts);
	        String[] change_gifts = S_gifts.split("\\s");
	        
	        int[][] BestFried = new int[][] {};

	        for (int i = 0 ; i < friends.length; i++) {
	        	for (int j = 0 ; j < friends.length; j++) {
	        		if() {
	        			
	        		}
	        	}
	        }
	        
	        return Arrays.toString(friends);
	    }
	 
	 public static void main(String[] args) {
		 
		 System.out.println(solution(new String[]{"muzi", "ryan", "frodo", "neo"}, 
				new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
		 
		
	}

}
