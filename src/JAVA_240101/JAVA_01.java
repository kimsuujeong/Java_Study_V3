package JAVA_240101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class JAVA_01 {
	public static int[] woo_rie_team_mang_ham(int[] progresses, int[] speeds) {

		Queue<Integer> complete = new LinkedList<Integer>();
		int progresses_ln = progresses.length;

		for (int i = 0; i < progresses_ln; i++) {
			complete.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
		}

		// 7일에 한번 씩 한번에 업로드 할 수 있음

		// return complete.stream().mapToInt(Integer::intValue).toArray(); --> 7, 3, 9
		//
		// [5,10,1,1,20,10]

		ArrayList<Integer> complete_day = new ArrayList<Integer>(); // 결과값 담기

		while (!complete.isEmpty()) { // 비어있는 것을 다 빼준 다음에
			int day = complete.poll();
			int cnt = 1;

			while (!complete.isEmpty() && day >= complete.peek()) {
				cnt++;
				complete.poll();
			}
			complete_day.add(cnt);
		}

		// List<integer>형 int[] integer[]로 변환하는 방법
		// 리스트명.stream().mapToInt(Integer::intValue).toArray();
		return complete_day.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(woo_rie_team_mang_ham(new int[] { 93, 30, 55 }, new int[] { 1, 30, 5 })));
		System.out.println(Arrays
				.toString(woo_rie_team_mang_ham(new int[] { 95, 90, 99, 99, 80, 99 }, new int[] { 1, 1, 1, 1, 1, 1 })));

	}
}