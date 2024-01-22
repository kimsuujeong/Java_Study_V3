package JAVA_240118;

import java.util.Scanner;

public class Circle {
	
	static int r;
	static double size;
	static double PI = 3.141592;
	
	Circle(){
		
	}
	
	
	private static void process() {
		size = r*r*PI;
	}
	private void output() {
		System.out.printf("원의 넓이 : %.2f", size);

	}
	
	
	public static int getR() {
		return r;
	}
	public static void setR(int r) {
		Circle.r = r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름 : ");
		r = sc.nextInt();
		process();
		new Circle().output();
		
		
	}

}
