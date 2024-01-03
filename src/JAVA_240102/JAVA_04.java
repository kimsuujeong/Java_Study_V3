package JAVA_240102;

import java.util.Scanner;

public class JAVA_04 {
	/*
	 * 문2
	 * 
	 * 2개의 숫자와 연산자를 입력하여 계산하시오 조건1) 실수인경우는 소수이하 2째자리까지 출력하시오 조건2) 연산자가 +,-,*,/ 이외의
	 * 문자가 들어오면 "연산자error"출력하시오
	 * 
	 * [실행결과] A값을 입력하시오: 25 B값을 입력하시오: 36 
	 * 연산자를 입력(+,-,*,/) : + 25 + 36 = xx
	 * 
	 * A값을 입력하시오: 25 B값을 입력하시오: 36 연산자를 입력(+,-,*,/) : 
	 * / 25 / 36 = xx.xxxxx
	 * 
	 * A값을 입력하시오: 25 B값을 입력하시오: 36 연산자를 입력(+,-,*,/) : # 연산자 error
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("A값을 입력하시오: ");
		int A = sc.nextInt();
		System.out.println("B값을 입력하시오 : ");
		int B = sc.nextInt();
		System.out.println("연산자 입력 : ");
		String c = sc.next();

		switch (c) {
		case "+":
			System.out.println(A+"+"+B+"="+(A+B));
			break;
		case "-":
			System.out.println(A+"-"+B+"="+(A-B));
			break;
		case "*":
			System.out.println(A+"*"+B+"="+(A*B));
			break;
		case "/":
			System.out.println(A+"/"+B+"="+(A/B));
			break;

		default:
			System.out.println("연산자 error");
			break;
		}

	}
}
