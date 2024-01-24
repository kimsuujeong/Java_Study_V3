package JAVA_240123;

import java.util.Arrays;

public class JAVA_01 {
	
	public static int solution(int[][] routes) {
		
		// 최소 하나는 놔준 채로 시작한다
		int answer = 1;
		
		// 왼쪽 배열 기준으로 정렬 (람다)
		Arrays.sort(routes, (o1,o2)->{
			if(o1[1]==o2[1]) {
				return o1[0]-o2[0];
			}
			return o1[1]-o2[1];
		});
		
		int routes_ln = routes.length;
		int camera = routes[0][1];
		for(int i = 1; i < routes_ln; i++ ) {
			// 끝 자리 기준으로
			// 만약 끝 자리 기준보다 다음 끝 자리가 크면
			// 카메라를 하나 놔줘야한다.
			if(routes[i][0] > camera) {
				answer += 1;
				// 카메라 위치를 그 다음 출발점 끝에 놔준다
				camera = routes[i][1];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// test case
		int[][] routes = {{-20, -15}, {-14,-5}, {-18,-13}, {-5,-3}};
        System.out.println(solution(routes));
	}
	
}
