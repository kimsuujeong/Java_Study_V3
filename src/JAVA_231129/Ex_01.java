package JAVA_231129;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		// 0에서 999이하의 정수를 입력받고, 입력 받은 수의 각각 자릿수를 더한결과를 출력하세요
		
		System.out.println("0~999까지의 정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(num / 100 + num % 100 / 10 + num % 10 / 1);
		
	}

}
