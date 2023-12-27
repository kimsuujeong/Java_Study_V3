package JAVA_231129;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println( num >= 8 ? "학교에 다닙니다": "학교에 다니지 않습니다");
	}

}
