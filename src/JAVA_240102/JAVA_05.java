package JAVA_240102;

import java.util.Scanner;

public class JAVA_05 {
	/*
	 * 문3 
	 * 년도를 입력받아 윤년/평년 구하기 
	 * (공식)①,② 두조건을 다 만족해야 윤년임 
	 * ①년도를 4로 나누어 떨어져야 함 
	 * ②년도를 100으로나누어 떨어지지 않거나 년도를 400으로 나누어 떨어져야 함 (참고) 4(윤년), 100(평년), 400(윤년)임
	 * 
	 * --출력-- 년도 입력 : 2000 윤년
	 * 
	 * 년도 입력 : 2001 평년
	 * 
	 * 년도 입력 : 2004 윤년
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 적어주세요");
		int year = sc.nextInt();
		
		String years;
		
		if (year % 100 == 0) {
			years = "평년";
		}else {
			years = (year % 4 == 0 || year % 400 == 0 ? "윤년" : "평년");
		}
		
		System.out.println(year+"년도는 "+years+" 입니다.");
		
	}

}
