package JAVA_231129;

import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		// 근무 시간을 입력받아 급여를 계산하여 출력한다
		
		// 50시간 까지의 급여는 10000원이다.
		// 50시간 초과한 금액에 대해서는 10%를 더 지급한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간: ");
		int time = sc.nextInt();
		
		if (time < 50) {
			System.out.println("급여: " + time*10000);
		} else System.out.println("급여: " + time*10100);
	}

}
