package JAVA_240109;

import java.util.Scanner;

public class JAVA_03 { // 문2
	public static void main(String[] args) {
		int []month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 달 : ");
		int months = sc.nextInt();
		System.out.printf("%d월은 %d일 입니다", months, month[months-1]);
	}

}
