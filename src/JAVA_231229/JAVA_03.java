package JAVA_231229;

import java.util.Scanner;

public class JAVA_03 { // 문제1
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println((n < 0 || n > 100) ? "입력 오류" : String.valueOf(n));
	}

}
