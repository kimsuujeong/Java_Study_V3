package JAVA_240103;

import java.util.ArrayList;
import java.util.Collections;

public class JAVA_02 {
	// 카드가 1부터 100장까지 있다.

	// 2 <= cards의 길이 >=100이하 자연수 만큼 작은 상자를 준비한다.

	// 카드 수 = 작은 상자 수

	// 준비된 상자에 카드를 한 장씩 넣고, 상자를 무작위로 섞어 일렬로 나열하며,
	// 상자가 나열 된 순서에 따라 1번부터 순차적으로 증가하는 번호를 붙임

	// dfs?

	public static int hon_ja_jalnom(int[] cards) {
		
		int cards_ln = cards.length;
		boolean[] dfs = new boolean[cards_ln]; // 방문 한 값을 True로 바꿔준다.

		ArrayList<Integer> list = new ArrayList<>();
		
		// 8 6 3 7 2 5 1 4
		// 0 6 3 0 2 5 0 0 
		
		for (int i = 0; i < cards_ln; i++) {
			
			int core = 0;
			int idx = i;
			
			while (!dfs[idx]) { // 열지 않은 상자가 있을 때
				
				dfs[idx] = true; // 상자를 연다 
				core++; // 점수 += 1
				idx = cards[idx] - 1; // 0 6 3 0 2 5 0 0  --> 0이 된 숫자 만큼 true
				
				
			} if (core > 0) {
				list.add(core); // 나머지 0보다 큰수를 다 뽑는다.
			}
			

		}
		// add(value) 메서드의 경우 만약 삽입에 성공하면 true를 반환,
		// 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생
		
		// 오름차수 정렬
		Collections.sort(list);
		
		// 뽑아갔던 [1478] -> 4 / [2,5,6] -> 3 을 곱해준다 그러면 12임
		return list.get(list.size() - 1) * list.get(list.size() - 2);

	}

	public static void main(String[] args) {

		System.out.println(hon_ja_jalnom(new int[] { 8, 6, 3, 7, 2, 5, 1, 4 }));

	}
}
