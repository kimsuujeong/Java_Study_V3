package JAVA_240109.OOP;

public class MethodOverExam {
	
	// 퀴즈
	// 임의의 변수 a,b에는 정수나 시루가 입력될 수 있음.
	// 두 변수 중 큰 값을 출력하는 메섣 find_max를 만들어 보세요
	
	public static double find_max(double a, double b) {
	return a > b ? a : b;
	}
	
	public static int find_max(int a, int b) {
	return a > b ? a : b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(find_max(3,8));
		
	}

}
