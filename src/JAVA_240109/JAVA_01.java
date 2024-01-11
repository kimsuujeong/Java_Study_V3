package JAVA_240109;


public class JAVA_01 {

	public static int answer(int n, int[] money) {

		int cnt = 0;
		int money_ln = money.length;
		
		for (int i = 0; i < money_ln; i++) {
			for (int j = 0; j < money_ln; j++) {

				if (money[i] - money[j] == n) {
					cnt++;
				}

			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		// N = 5 원을 가지고 거슬려 줘야하고
		// money는 1,2,5원 있다
		// 5 = 5;
		// 5 = 3+2;
		// 5 = 1+2*2;
		// 5 = 1*5;
		
		System.out.println(answer(5, ((new int[]{1,2,5}))));
	}
}
