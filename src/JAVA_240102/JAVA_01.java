package JAVA_240102;

import java.util.ArrayList;

public class JAVA_01 {
	/*
	 * 입출력 예 numbers return "17" 3 "011" 2
	 * "17" = 1,7,17,71 중에서 7,17,71
	 * "011" = 0,1,11,110,101 중에서 11,101
	 */
	static int cnt; // 최종 소수 갯수 count
    static boolean[] visited = new boolean[7]; // numbers는 길이 1 이상 7 이하인 문자열
    static ArrayList<Integer> arry = new ArrayList<>(); // 자리 수 만들어서 담아줄 list
    
    public static void rec(String n, String temp, int len) { // 각 자리 수를 조합 할 재귀 메서드
    	
    	
    	
    }
    
    public static String find_prime(String numbers) {
    	String temp = ""; // 각 자리 수를 붙여나갈 변수
    	int numbers_ln = numbers.length();
    	
    	for(int i = 1; i<numbers.length(); i++ ) {
    		rec(numbers,temp,i);
    	}
    	
    	return null;
    }
	

	public static void main(String[] args) {

		System.out.println("numbers return");
		System.out.println(find_prime("17"));
		System.out.println(find_prime("011"));
		/*
		 * numbers return "17" 3 "011" 2
		 */
	}
}
