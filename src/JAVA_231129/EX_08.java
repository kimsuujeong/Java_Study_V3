package JAVA_231129;

import java.util.Scanner;

public class EX_08 {
	public static void main(String[] args) {
		// 정수 3개를 입력 받아 IF문을 이용하여 그 중 가장 큰 수를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("세 번째 정수 입력 : ");
		int num3 = sc.nextInt();
		
		
		int max = num1;
		
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		
		System.out.println(num1+","+num2+","+num3+"," + "중 가장 큰 수는" + max +"입니다.");
		
	}

}
