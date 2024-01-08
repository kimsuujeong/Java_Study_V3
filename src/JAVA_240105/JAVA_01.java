package JAVA_240105;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JAVA_01 {

	/*-1+1+1+1+1 = 3
	+1-1+1+1+1 = 3
	+1+1-1+1+1 = 3
	+1+1+1-1+1 = 3
	+1+1+1+1-1 = 3*/

	/*
	 * 주어지는 숫자의 개수는 2개 이상 20개 이하입니다. 
	 * 각 숫자는 1 이상 50 이하인 자연수입니다. 
	 * 타겟 넘버는 1 이상 1000 이하인
	 * 자연수입니다. 
	 * 
	 * 입출력 예 
	 * numbers 			target  return 
	 * [1, 1, 1, 1, 1]	 3 		5 
	 * [4, 1, 2, 1] 	 4 		2
	 */
	public static int answer (int[] numbers, int target) {
		int cnt=0;
		int numbers_ln = numbers.length;
		// dfs?
		for (int i = 0; i < numbers_ln; i++) {
			for (int j = 0; j < numbers_ln; j++) {
				
				if (numbers[i]-numbers[j]==target) {
					cnt++;
				}
				
			}
		}
		
		return  cnt;
	}
	
	public static void main(String[] args) {
		
		System.out.println(answer(new int[] {1, 1, 1, 1, 1}, 3));
		
	}

}
