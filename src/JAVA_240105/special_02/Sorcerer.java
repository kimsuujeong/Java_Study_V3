package JAVA_240105.special_02;

public class Sorcerer { // 마법사

	/*
	 * 마법사는 마법을 사용하여 마력을 소비할 수 있습니다. 
	 * 
	 * 마법을 사용하면 마력이 감소하고, "마법을 사용했습니다!"라는 메시지가 출력됩니다.
	 * 마법사는 마법을 사용할 수 있는데, 특정한 마법을 배우면 추가로 특수한 마법 기술을 사용할 수 있습니다. 
	 * 마법사는 "파이어볼"과
	 * "힐링"이라는 두 가지 마법을 배울 수 있습니다. 
	 * 
	 * "파이어볼"을 사용하면 적을 공격하여 대미지를 입히고, "힐링"을 사용하면 자신의 체력을 회복할 수 있습니다.
	 */
	
	int hp = 0;
	int mana = 100;
	
	
	public Sorcerer(int i) {
		// TODO Auto-generated constructor stub
		hp = i;

	}

	void learnSpell() {
		
	}
	
	String learnSpell(String string) { // 파이어 볼 스킬을 배웠습니다.
		// TODO Auto-generated method stub
		return string;
	}

	void castSpell(String string) { // 파이어볼 출력
		// TODO Auto-generated method stub
		if (this.learnSpell(string) == "파이어볼") {
			System.out.println("마법을 사용했습니다!");
			hp -= 10;
			mana -= 10;
			
		} else {
			System.out.println("파이어볼 마법을 배우지 않았습니다.");
		}
		
		if (learnSpell(string) =="힐링") {
			System.out.println("마법을 사용했습니다!");
			mana += 10;
		} else {
			System.out.println("힐링 마법을 배우지 않았습니다.");
		}

	}

	int getMana() { // 마나 수 출력
		// TODO Auto-generated method stub
		return mana;
	}



}
