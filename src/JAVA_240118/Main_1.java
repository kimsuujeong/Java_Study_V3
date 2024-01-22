package JAVA_240118;

import JAVA_240116.JAVA_03.calculator;

public class Main_1 {
	
	public static void main(String[] args) {
		Health p1 = new Health();
		
		Info info = new Info();
		
//		p1.gender = 'M'; // 남(M),여(F)
//		p1.tall = 175.3;
//		p1.weight = 95.45;
		
		p1.input('M', 175.3, 95.45);
		
		System.out.println("***** 비만도 chech *****");
		p1.output1(p1);
		System.out.println("");
		
		new calculator();
		
		
		
	}


}
 