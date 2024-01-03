package JAVA_240102;

import java.util.Arrays;
// 제가 추가한 코멘트는 /* */ 사이를 보시면됩니다.
// 총평
// 1. 고뇌의 흔적이 많이보임
// 2. 심사위원수를 구하는경우를 따로 메소드로 만들면 재사용성을 높일수 있지 않을까?
// 3. 변수명이 조금더 명확하면 좋을거같음!
// 4. 나머지는 /**/ 내용 참조

class JAVA_02 {

	public static long jolra_gine(long n, long[] times) {

		// 사람수?? 1<=1,000,000,000명 ---> 넘무 많음 long으로 지정
		// 심사원도?? 1<=1,000,000,000명 넘무 많음
		// n = 사람수임

		long shortSimsa = 0; // 심사 빨리 끝나는 시간
		long longSimsa = times[times.length - 1] * n; // 최대시간 = 가장 오래 걸리는 시간* 인원수

		long simsa = 1;// 심사위원

		while (shortSimsa <= longSimsa) {
			/* (shortSimsa + (longSimsa - shortSimsa) / 2) 와 수정씨의 코드의 차이가 있는지 확인해보면 좋아요. */
			long mid = (shortSimsa + longSimsa) / 2;
			long sum = 0; // 심사위원 수 구하기

			for (int i = 0; i < times.length; i++) {
				sum += mid / times[i];
				// 심사 빨리 하는 심사원 순서대로 출력
			}
			// 심사 위원 수가 n보다 많다면 줄여도 괜찮음 -1
			if (sum >= n) {
				longSimsa = mid - 1;
				simsa = mid;

			} else {
				// 심사 위원 수가 n보다 적다면 심사위원 고용해야함 +1
				shortSimsa = mid + 1;

			}
		}
		return simsa;// 최솟 값 리턴하기
	}

	public static void main(String[] args) {

		long n = 6; // 여기서 할당해줄거임
		long[] times = { 7, 10 };
		System.out.println("n " + n);
		System.out.println("times " + Arrays.toString(times));
		System.out.println("return " + jolra_gine(n, times));
	}
}