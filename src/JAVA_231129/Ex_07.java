package JAVA_231129;

import java.util.Scanner;

public class Ex_07 {
	public static void main(String[] args) {
		// 2개의 숫자를 입력받고, 입력된 숫자가 같으면 정사각형
		// 다르면 직사각형
		
		// 입력된 숫자중 하나가 0과 같거나 작을 경우 프로그램을 종료한다
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		
		
		
		if (num1<=0&num2<=0){
			if (num1==num2){
				System.out.println("정사각형의 넓이는"+(num1*num2)+" 입니다.");

			}else {
				System.out.println("직사각형의 넓이는" + (num1*num2)+ "입니다.");
			}
		}else {
			System.out.println("프로그램을 종료 합니다.");
			
		} 
		
	}

}
