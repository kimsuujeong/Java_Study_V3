package JAVA_240108;

import java.util.Collections;
import java.util.PriorityQueue;

public class JAVA_02 {
	static int gae_p_gon_ham_cipal(int[] works, int n) {

		// 이 문제에 대한 질문
		// 1번문제는 오름차순 내림차순을 잘 이용했는데
		// 이 문제에서 우선순위큐를 썼던 이유는?

		// 야근 피로도 = 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값
		// N 시간 동안 야근 피로도를 최소화하도록 일
		// 1시간 동안 작업량 1만큼 처리할 수 있다고 한다.
		// 퇴근까지 남은 N시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴
		int answer = 0;
//		long answer = 0; // -> 해결;; int를 long으로 바꿔주니 테스트 케이스에 통과했습니다.
		int works_ln = works.length;

		// 내림차순

		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		// -> 오름차순으로 정렬 후, 뒤에서 부터 빼줄 수 있지만,
		// 큰 수 부터 빼야지 제곱 했을 때 적은 수가 나올 수 있습니다.
		// 그래서 우선순위 큐 Collection.reversOrder을 이용해서
		// 내림차순으로 내려 준 후, 제일 앞에 있는 수는 무조건 큰 수 밖에 올 수 없기 때문에
		// 우선순위 큐를 사용었습니다.

		for (int i = 0; i < works_ln; i++) {
			q.add(works[i]);
		}
		
		for (int i = 0; i < n; i++) {
			int max = q.poll(); // 가장 큰 값 빼기

			if (max <= 0) {
				break;
			}
			
			q.add(max - 1); // 제일 큰 값에서 1 빼주기
		}

		while (!q.isEmpty()) { // 빌 때 까지 계속
			int k = q.poll();
			// 남은 작업량 제곱
			answer += (k * k);
		}

		return answer;

	}

	public static void main(String[] args) {

		// 2^2+2^2+2^2=12
		// 1^2+1^1+2^2=6

		System.out.println("works\tn\tresult");
		System.out.println("[4,3,3]\t4\t" + gae_p_gon_ham_cipal(new int[] { 4, 3, 3 }, 4));
		System.out.println("[2,1,2]\t1\t" + gae_p_gon_ham_cipal(new int[] { 2, 1, 2 }, 1));
		System.out.println("[1,1]\t3\t" + gae_p_gon_ham_cipal(new int[] { 1, 1 }, 3));

	}

}