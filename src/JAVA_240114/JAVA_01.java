package JAVA_240114;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JAVA_01 {

//	문1 정답
//	(메서드 아니라도 상관x)
//	public int getMatrixMaxValue(int[][] matrix) {
//		int max = Integer.MIN_VALUE;
//		// MAIN_VALUE -> {@코드 int}가 * 가질 수 있는 최대값인 2<sup>31</sup>-1을 유지하는 상수입니다.
//		for (int i = 0; i < matrix.length; i++) {
//			// 배열 다 뽑기이
//			for (int j = 0; j < matrix[i].length; j++) {
//				if (matrix[i][j] > max) {
//					// 제일 큰 수 찾기
//					max = matrix[i][j];
//					// max에 가장 큰 수 담아주기
//				}
//			}
//		}
//		return max;
//	}

////	문2 정답
//
//	public static void main(String[] args) {
//		int num;
//		int sum = 0;
//
//		for (int i = 1; i <= 50; i++) {
//			num = new Random().nextInt(101);
//			// random 함수 100개 까지 뽑아주기
//			System.out.print(num + "\t");
//			sum += num; // 모두 다 더해주기
//			if (i % 6 == 0)
//				System.out.println();
//			// 6의 배수라면 프린트 해주기
//		}
//		System.out.println("\n합 = " + sum);
//		// 합!
//	}
//
////	문3 정답
//
//	public int return_add(int a, int b) {
//		if (b < a) {
//			int temp = a;
//			a = b;
//			b = temp;
//		} // 둘 중에 큰 수 추출 하기
//
//		int sum = 0;
//		for (int i = a; i <= b; i++) {
//			sum += i;
//			// a~b까지 모든 수 더한 것을 sum에 받아주기
//		}
//		return sum;
//	}
//
////	문4 정답
//
//	public static void main(String[] args) {
//		gunchime gu = new gunchime();
//		gu.gunchim(9);
//	}
//
//	public void gunchim(int g) {
//		List<String> gun = new ArrayList<String>();
//		// List에 받아주기
//		
//		gun.size();
//		while (gun.size() < g) { // g만큼 출력
//			if (g < 10000) {
//				gun.add("군");
//				if (gun.size() == g) {
//					break;
//				} // 처음에는 군을 담아주고
//				if (gun.size() % 2 != 0 || gun.size() == 1) {
//					gun.add("침");
//					// 2로 나눴을 때ㅐ 나머지가 0이 아니거나 1이면 침
//				}
//			} else {
//				System.out.println("범위내의 길이를 입력하세요");
//				break;
//			}
//		}
//		for (String i : gun) {
//			System.out.print(i);
//		} // 받아준 list에 있는 값을 다 빼준다.
//	}
//
////	문5 정답
//
	public static String strange_word(String s) {
		char[] chars = s.toCharArray();
		// Stirng 문을 배열에 담아주깅
		boolean isUpper = true;
		// 첫 문장은 true로 시작하기

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ') {
				isUpper = true; // 공백이면 true로 넘어가주기
			} else {
				if (isUpper) {  // true면 대문자
					chars[i] = Character.toUpperCase(chars[i]);
				} else { // false면 소문자
					chars[i] = Character.toLowerCase(chars[i]);
				}
				isUpper = !isUpper; 
				// 들어온 값이 true면 false , false면 true로 바꿔주고 다음 문으로 넘어가기
			}
		}

		return String.valueOf(chars);
	}
	
}
