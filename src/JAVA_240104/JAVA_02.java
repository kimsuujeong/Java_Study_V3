package JAVA_240104;

import java.util.Arrays;
import java.util.Collections;

public class JAVA_02 {

	// INTEGER,레퍼클래스?
	// 숫자가(0포함) 주어졌을 때 숫자들을 이어 붙여 만들 수 있는 가장 큰 수를 찾는 문제입니다.

	// [6,10,2]
	// [6102, 6210, 1062, 1026, 2610, 2106]
	// 가장 큰 수는 6210]

	// [6][1][0][2]
	// 가장 큰 수를 찾는다.
	public static String find_biggest_num(int[] n) {

		String[] arry = new String[n.length];
		int arr_ln = arry.length;
		

		// String에 n 배열을 받아준다 -> "6102"
		for (int i = 0; i < arr_ln; i++) {

			arry[i] = String.valueOf(n[i]); // valueOf -> 객체를 바꾸는 방법
											// Stirng 형으로 담아줌
			
		}
		
		


//		Arrays.sort(arry, Collections.reverseOrder()); // 내림차수 정렬

		String answer = "";

		for (String i : arry) { // arry에 저장된 값 다 뽑아주기
			answer += i; //answer 에 할당
		}
		
		return answer; // return으로 뽑아줌
		
		 

	}

	public static void main(String[] args) {
		//[3, 30, 34, 5, 9]	"9534330"
		System.out.println("numbers\t\t\treturn");
		System.out.print("[6, 10, 2]\t\t");
		System.out.println(find_biggest_num(new int[] { 6,10,2 }));
		System.out.print("[3, 30, 34, 5, 9]\t");
		System.out.println(find_biggest_num(new int[] { 3, 30, 34, 5, 9 }));
		// 2번째 값 이상해서 다시 수정해야함
		
	}

}
