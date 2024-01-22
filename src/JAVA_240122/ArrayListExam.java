package JAVA_240122;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {

		// ArrayList는 제네릭 타입이다.

		ArrayList list = new ArrayList();

		list.add(123);
		list.add(456);
		list.add(789);

		System.out.println(list.size());
		System.out.println(list);
		// 퀴즈
		// 반복문을 활용하여 리스트만의 있는 모든 요소를 삭제 해주세요
		
		// 컬렉션 프레임 워크의 리스트는 객체가 삭제되면 곡백만큼 땡겨옴
		for (int i = 0 ; i <= list.size()+1; i++) {
			list.remove(0);
		} System.out.println(list.toString());
	}

}
