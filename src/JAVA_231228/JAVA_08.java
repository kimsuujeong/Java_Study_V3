package JAVA_231228;

import java.util.Scanner;

public class JAVA_08 {
	
	public static void main(String[] args) { // 추가문제 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		System.out.println("상품가격: ");
		int price = sc.nextInt();
		System.out.println("깍아줘");
		int discount = sc.nextInt();
		
		int rate = price - (price * discount / 100);
		
		System.out.printf("최종 가격은 %d원 입니다.", rate);
		
	}

}
