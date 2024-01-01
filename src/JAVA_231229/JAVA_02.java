package JAVA_231229;

import java.util.ArrayList;
import java.util.List;

public class JAVA_02 {

	// 마법사의 레벨은 자신의 번호의 약수 개수이다.

	// number은 마법사의 수를 나타내고
	// limit는 레벨의 제한을 나타낸다.
	static int Level_sum(int number, int limit) {
		// TODO Auto-generated method stub

		int cnt = 0; // count 새주기 // i_am_BlackMagician으로 나중에 바꿔주자
		int Magician = 0;
		int number_ln = number;

		List<Integer> numbers = new ArrayList<Integer>();
		// ex) number이 8이라면 1,2,3,4,5,6,7,8 이렇게 순서대로 담아줌

		// number 8을 1,2,3,4,5,6,7,8 이렇게 뽑아준다
		for (int i = 0; i <= number_ln; i++) {
			numbers.add(i);
		}

		for (int i = 0; i < number_ln; i++) {
			Magician += numbers.get(i);
		}
		//
		
		return Magician;

	}

	public static void main(String[] args) {

		System.out.println("number\tlimit\tresult");
		System.out.print("8\t3\t");
		System.out.println(Level_sum(8, 3));

	}

}

/*
 * 1~8이며 레벨 제한수가 3이라고 되어있다고 한다면 1 -> 1 [1] 2 -> 1,2 [2] 3 -> 1,3 [2] 4 -> 1,2,4
 * [3] 5 -> 1,5 [2] 6 -> 1,2,3,6 [4] // 제한되어 3임 7 -> 1,7 [2] 8 -> 1,2,4,8 [4] //
 * 제한되어 3임
 * 
 */
