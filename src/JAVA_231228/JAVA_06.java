package JAVA_231228;

import java.util.Scanner;

public class JAVA_06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**** 삼각형의 넓이 구하기  ****");
		System.out.print("밑변 : ");
		int width = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		float triangle = (float)(width*height/2);
		
		System.out.printf("넓이 : %.2f" , triangle);
	}

}
