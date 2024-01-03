package JAVA_240102;

import java.util.Scanner;

public class JAVA_03 {
	/*
	 * 문1
	 * 
	 * 성적처리프로그램
	 * 
	 * --입출력 화면--
	 * 
	 * 성적=93.20 <---소수이하 2째자리까지 학점=A System.out.printf("성적 : %.2f", avg);
	 * 평가=excellent
	 * 
	 * 
	 * 조건1) (중간+기말)/2 ---> 60% 레포트 ---> 20% 출석 ---> 20%
	 * 
	 * 조건2) 90이상 'A'학점 (3)A,B학점 ---->"excellent" 80이상 'B'학점 C,D학점 ---->"good" 70이상
	 * 'C'학점 F학점 ---->"poor" 60이상 'D'학점 (switch문이용) 나머지 'F'학점 (if~else if문이용)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간고사를 입력하세요 : ");
		float mid = sc.nextFloat();
		System.out.println("기말고사를 입력하세요 : ");
		float last = sc.nextFloat();
		System.out.println("레포트 고사를 입력하세요 : ");
		float report = sc.nextFloat();
		System.out.println("출석 고사를 입력하세요 : ");
		float attend = sc.nextFloat();
		

		float six = ((mid + last) / 2) * 0.6f;
        float reportScore = report * 0.2f;
        float attendScore = attend * 0.2f;

        float totalScore = six + reportScore + attendScore;
        
        int score = (int) (totalScore/10);
        
        System.out.println("중간고사 : " + mid);
        System.out.println("기말고사 : " + last);
        System.out.println("레포트 : " + report);
        System.out.println("출석 : " + attend);
        
        System.out.println("성적=" + totalScore);
        
        switch (score) {
		case 9:
			System.out.println("학점=A");
			System.out.println("excellent");
			break;
		case 8:
			System.out.println("학점=B");
			System.out.println("good");
			break;
		case 7:
			System.out.println("학점=C");
			System.out.println("poor");
			break;
		case 6:
			System.out.println("학점=D");
			break;

		default:
			System.out.println("학점=F");
			break;
		}
	}

}
