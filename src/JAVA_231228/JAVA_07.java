package JAVA_231228;

import java.util.Scanner;

public class JAVA_07 {  // 추가 문제 1
	
	static float pi = (float) 3.14;
	
	public static float area(int n) {
		// 원의 넓이 클래스
		return (float)n*n*pi;
	}
	
	public static float circumferencen(int n) {
		// 원의 둘레 클래스
		return (float)n*pi*2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름 대답 ");
		int n = sc.nextInt();
		
		System.out.printf("원의 넓이는 %.0f cm", area(n));
		System.out.printf("\n원의 넓이는 %.1f cm", circumferencen(n));
		
	}

}
