package JAVA_231227;

public class JAVA_03 {
	
	public static void ruppy() { //1
		String name = "lupy";
		int age = 10;
		double height = 972.4;
		String isType = "비버";
	}
	public static void student() { //2
		int score = 90;
		int subjectCount = 5;
		float average = score/subjectCount;
		
		System.out.println(average);
		
	}
	public static void cirlce() { //3
		float radius = (float) 5.0;
		float area = (float) (3.14*radius);
		
		System.out.println(area);
	}
	
	public static void name() { //4
		String name = "gunchim";
		int age = 11;
		String email = "gunchim@ssak.com";
		
		System.out.printf(name,age,email);
	}
	public static void mony() {
		long salary = 25000000000L;
		int rent = 8000000;
		int foodCost = 3000000;
		long totalExpenses = salary+rent+foodCost;
		
		System.out.println(totalExpenses);
	}
	public static void temperature() {
		float celsius = (float) 25.5;
		int fahrenheit = (int) ((celsius*1.8)+32);
		
		System.out.println(fahrenheit);
	}
	
	public static void main(String[] args) {
		student();
		cirlce();
		name();
		mony();
		temperature();
	}

}
