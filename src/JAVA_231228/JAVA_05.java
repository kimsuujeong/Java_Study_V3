package JAVA_231228;

import java.util.Scanner;

public class JAVA_05 { // 문제 3
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input name : ");
		String name = sc.next();
		System.out.print("\nkor : ");
		int kor = sc.nextInt();
		System.out.print("\neng : ");
		int eng = sc.nextInt();
		System.out.print("\nmat : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		float avg = (float)sum/3;
		
		System.out.printf("\n이름 : %s", name);
		System.out.printf("\n합계점수 : %d", sum);
		System.out.printf("\n평균점수 : %.1f" , avg);
		
	}

}
