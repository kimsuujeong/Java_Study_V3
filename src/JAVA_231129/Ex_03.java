package JAVA_231129;

public class Ex_03 {
	public static void main(String[] args) {
		
		int age = 9;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.print("취학 전 아동");
		} else if (age < 14) {
			charge = 2000;
			System.out.print("초등학생");
		} else if (age < 20) {
			charge = 2500;
			System.out.print("중. 고등학생");
		} else {
			charge = 2000;
			System.out.print("일반인");
		}
		
		System.out.println(" 입장료는" + charge + "입니다.");
	}

}
