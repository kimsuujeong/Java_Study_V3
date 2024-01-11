package JAVA_240110.OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class JAVA_03 {

	public static Set<String> ssing_and_song(String[] genres, int[] plays) {

		HashMap<String, String[]> map = new HashMap<String, String[]>();

		int idx = 0;
		int plays_ln = plays.length;
		int[] value = {plays_ln};
		
		// 장르별 (key)와 재생횟수,인덱스(vlaue) 저장
		for (int i = 0; i < plays_ln; i++) {
			for (int j = 0; j < plays_ln; j++) {
				
			}
		}
		
		

		return null;

	}

	public static void main(String[] args) {

		Set<String> result1 = ssing_and_song(new String[] { "classic", "pop", "classic", "classic", "pop" },
				new int[] { 500, 600, 150, 800, 2500 });

		System.out.println(result1);

//		genres											plays						return
//		["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
// -------------------------------------------------------------------------------------------------
//		classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.
//
//		고유 번호 3: 800회 재생
//		고유 번호 0: 500회 재생
//		고유 번호 2: 150회 재생
//		pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.
//
//		고유 번호 4: 2,500회 재생
//		고유 번호 1: 600회 재생
//		따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.
//
//		장르 별로 가장 많이 재생된 노래를 최대 두 개까지 모아 베스트 앨범을 출시하므로 2번 노래는 수록되지 않습니다.
	}

}
