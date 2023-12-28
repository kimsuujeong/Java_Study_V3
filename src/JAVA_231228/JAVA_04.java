package JAVA_231228;

public class JAVA_04 { // 문제2
	
	public static void main(String[] args) {
		
		int money = 3500000; // 기본금
		int time = 85000; // 시간수당
		float buty = (float) ((money+time)-(money-money*0.1)); //세금
		
		System.out.printf("%.0f",buty); // 소수점 버려주고 싶었음
		
	}
	
}
