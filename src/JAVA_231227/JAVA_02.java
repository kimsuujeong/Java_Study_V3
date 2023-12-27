package JAVA_231227;

public class JAVA_02 {

	public static int paack(int n) {
		
		// n은 멀리뛰기 하는 칸
		
		int[] array = new int[2000]; //runtime에러로 최대값 채워줘야함
		
		array[0] = 1; // 한번 뛰었을 때
		array[1] = 2; // 두번 뛰었을 때
		
		// 몇가지 수인지 계산하는거임
		/*ex)
		 * 5=1+1+1+1+1
		 * 5=1+2+1
		 * 5=1+1+2
		 * 5=2+1+1
		 * 5=2+2+1
		 * ------->
		 * n = n-1 + n-2 -> 갈 수 있는게 1칸 , 2칸 밖에 없음
		 */
		
		// 1 = < n > = 2000
		for (int i = 2; i <= n; i++) {
			
			
			array[i] = (array[i - 1] + array[i - 2]) % 1234567; // 저거 1234567은 의미 없음 위에 최대값 만큼 2000 집어넣어도 됨
		}
	

		return array[n-1]; //
	}


	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 3;
		
		System.out.println("n\tresult");
		System.out.print("4\t");
		System.out.print(paack(num1));
		System.out.println();
		System.out.print("3\t");
		System.out.print(paack(num2));

	}
}
