package JAVA_231227;

public class JAVA_01 {

	/*
	 * 최소공배수(Least Common Multiple) = 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자. 예를 들어 2와 7의
	 * 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
	 * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, e_jungdo_nun_easy를 완성해 주세요.
	 * 
	 * 제한 사항 arr은 길이 1이상, 15이하인 배열입니다. arr의 원소는 100 이하인 자연수입니다. 입출력 예 arr result
	 * [2,6,8,14] 168 [1,2,3] 6
	 */


	// 최대공약수
	private static int gcd(int a, int b) {
		if (a % b == 0)
			return b;
		return gcd(b, a % b);

	}

	// 최소공배수
	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
	public static int Least_Common_Moultiple(int[] arr) {

		int e_jungdo_nun_easy = arr[0];

		for (int i = 0; i < arr.length; i++) {
			e_jungdo_nun_easy = lcm(e_jungdo_nun_easy, arr[i]);
		}
		return e_jungdo_nun_easy;

	}

	public static void main(String[] args) {

		int[] arr1 = { 2, 6, 8, 14 };
		int[] arr2 = { 1, 2, 3 };
		
		System.out.println("arr\tresult");
		System.out.print("[2,6,8,14] "+Least_Common_Moultiple(arr1));
		System.out.println();
		System.out.print("[1,2,3] "+ ""+Least_Common_Moultiple(arr2));

	}

}
