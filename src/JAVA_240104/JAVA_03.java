package JAVA_240104;

import java.util.HashMap;

import java.util.Map;

public class JAVA_03 {

	// ex)
	// N[5] 4 1 5 2 3
	// M[5] 1 3 7 9 5
	// 1 1 0 0 1 -> 1은 있는거 0은 없는 것

	public static void answer(int N, int M, String n, String m) {
		// 스택 별로누................
		// 뭐써야하누...........
		// 히구리 퐁퐁
		int[] firstList = new int[N];
		int[] secondList = new int[M];

		for (int i = 0; i < N; i++) { // String -> int 값에 담는거임
									  // char[] arr = str.toCharArray();
									  // 이게 가dog성이 좋지만,
									  // 문제에서 배열 수를 지정해 주시래서 ^^..
			firstList[i] = n.charAt(i);
		}
		for (int i = 0; i < N; i++) {
			secondList[i] = m.charAt(i);
		}

		Map<Integer, Integer> map = new HashMap<>();

		// 키 리스트 값을 맵으로 키 만들기
		for (int key : firstList) {
			map.put(key, 1);
		}
	
		// 찾아야 할 리스트 값이 맵의 키로 존재하면 1, 존재하지 않으면 0
		 for (int i = 0; i < M; i++) {
	            if (map.containsKey(secondList[i])) {
	            	// 키 값이 있는지 없는지 확인 하는 방법 -> containsKey
	                System.out.print("1\n");
	            } else {
	                System.out.print("0\n");
	            }
	        }
	}

	public static void main(String[] args) {

		int A = 5;
		int B = 5;

		String a = "41523";
		String b = "13795";

		answer(A, B, a, b);

	}

}
