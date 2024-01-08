package JAVA_240105.special_02;

import java.util.ArrayList;

public class Rogue { //도적
	
	int Dex; // 민첩
	ArrayList<String> list = new ArrayList<>();
	
	
	// 도적 은신 능력!!
	static int egility; // 민첩!!
	
	public Rogue(int i) {
		// TODO Auto-generated constructor stub
		Dex = i;
	}

	void hide() {
		// TODO Auto-generated method stub
		System.out.println("은신합니다...");
		
	}

	void addItemToBackpack(String string) {
		// TODO Auto-generated method stub
		list.add(string);
		System.out.printf("%s 을 넣었습니다.",string);
		System.out.println("");
		
		
	}
	void bag() {
		System.out.printf("가방 열기!!! \n %s \n", list);
	}

	void removeItemFromBackpack(String string) {
		// TODO Auto-generated method stub
		System.out.printf("%s 을 삭제했습니다.",list);
		list.remove(string);
		System.out.println("");
		
		System.out.println(list);
		
	}

}
