package JAVA_231229;

public class JAVA_06 {

	public static double solution(int[] numbers) {

		int sum = 0;
		int ln = numbers.length;
		
		for (int i = 0; i < ln; i++) {
			sum += numbers[i];
		}
		
		return (double)sum;
		
	}
	
	public static void main(String[] args) {
		
		int[] Numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.print(solution(Numbers));
	}
	
}
