package JAVA_231228;

public class JAVA_03 { // 문제1
	
	public static void main(String[] args) {
		int money = 97240;
		
		System.out.println("만원 = " + money/10000);
		System.out.println("천원 = " + money%10000/1000);
		System.out.println("백원 = " + money%1000/100);
		System.out.println("십원 = " + money%100/10);
		
	}

}
