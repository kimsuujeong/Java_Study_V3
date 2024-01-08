package JAVA_240105;

public class JAVA_05 {
	
	public static int sum(int sum_a, int sum_b) {
		return sum_a+sum_b;
	}
	
	public static int sub(int sub_a, int sub_b) {
		return sub_a-sub_b;
	}
	public static int mul(int mul_a, int mul_b) {
		return mul_a*mul_b;
	}
	public static float div(int div_a, int div_b) {
		return (float)div_a/div_b;
	}
	
	public static void main(String[] args) {
		
		System.out.printf("더하기 : %d", sum(3, 5));
		System.out.printf("\n빼 기 : %d", sub(7, 2));
		System.out.printf("\n곱하기 : %d", mul(4, 5));
		System.out.printf("\n나누기 : %.2f", div(7, 3));
		
	}

}
