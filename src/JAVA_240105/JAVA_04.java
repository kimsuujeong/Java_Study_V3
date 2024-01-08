package JAVA_240105;

import java.util.Scanner;

public class JAVA_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-입력-");
		System.out.println("품명 : ");
		String name = sc.next();
		System.out.println("수량 : ");
		int number = sc.nextInt();
		System.out.println("단가 : ");
		int money = sc.nextInt();
		
		System.out.println("-출력-");
		System.out.printf("\n품명 %s", name);
		System.out.printf("\n금액 %d", number*money);
		
		
	}

}
