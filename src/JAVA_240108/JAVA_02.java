package JAVA_240108;

import java.util.Collections;
import java.util.PriorityQueue;

public class JAVA_02 {
	static int gae_p_gon_ham_cipal(int[] works, int n) { // 효율성 엄청 떨어져요 쌤 ^^..... 도와주세여...
		
		// 야근 피로도 = 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값
		// N 시간 동안 야근 피로도를 최소화하도록 일
		// 1시간 동안 작업량 1만큼 처리할 수 있다고 한다.
		// 퇴근까지 남은 N시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴
		int answer = 0;
		int works_ln = works.length;
		
		// 내림차순
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		// 제일 큰 숫자부터 빼준다
		
		for (int i = 0; i < works_ln; i++) {
			q.add(works[i]);
		}
		
		for (int i = 0 ; i < n ; i++) {
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
		System.out.println("[4,3,3]\t4\t"
				+gae_p_gon_ham_cipal(new int[] {4,3,3},4));
		System.out.println("[2,1,2]\t1\t"
				+gae_p_gon_ham_cipal(new int[] {2, 1, 2},1));
		System.out.println("[1,1]\t3\t"
				+gae_p_gon_ham_cipal(new int[] {1, 1},3));
		
		
	}

}
