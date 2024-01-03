package JAVA_240103;

import java.util.Arrays;

public class JAVA_01 {
	/*
	 * 함수 egun_mosam은 정수 a와 자연수 b을 입력 받아, 
	 * a부터 시작해 b씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
	 * 다음 제한 조건을 보고, 조건을 만족하는 함수, egun_mosam을 완성하세요
	 * 
	 * 제한 조건 n은 1000 이하인 자연수입니다. 
	 * 입출력 예 
	 * a  n answer 
	 * 2  5 [2,4,6,8,10] --> 2*5 = 10 / 10까지 2단 출력
	 * 4  3 [4,8,12] --> 4*3 = 12 / 12까지 4단 출력
	 * -4 2 [-4, -8] --> -4*2 = 18 / -8까지 -4단 출력
	 */
	public static int[] egun_mosam(int a, int n) {
		
		int b = n; // b씩 증가하는 숫자 n개
		int[] gob = new int[b];
		
		for(int i = 0; i < b; i++) {
			gob[i]+= a + a*i;
		}
		
		return gob;
	}
	
	public static void main(String[] args) {
		System.out.print(Arrays.toString(egun_mosam(2, 5)));
	}

}
