package JAVA_231129;

import java.io.File;
import java.util.Scanner;

public class Ex_05 {
	
	public static void main(String[] args) {
		// 점수를 입력받아 홀수인지 짝수인지 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int num = sc.nextInt();
		
		if (num%2==0) {
			
			System.out.println("짝수입니다.");
			
		} else System.out.println("홀수입니다.");
	}

}
