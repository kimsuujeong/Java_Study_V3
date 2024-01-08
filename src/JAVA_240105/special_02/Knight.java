package JAVA_240105.special_02;

public class Knight { // 기사
	int hp = 0;
	// 검의 강인함!!
	static int health; // 강함!!

	public Knight(int i) {
		// TODO Auto-generated constructor stub
		hp = i;
	}

	void attack() {
		hp -= 20;
		System.out.println("검으로 공격 했습니다.");
		System.out.println("아프노");
		System.out.printf("HP = %d",hp);
		System.out.println("");
		
	}

	void block() {
		// TODO Auto-generated method stub
		hp -= 5;
		System.out.println("방패 막기!!");
		System.out.println("덜 아프노");
		System.out.printf("HP = %d",hp);
		System.out.println("");
		
	}

	public int getHealth() {
		// TODO Auto-generated method stub
		return hp;
	}

}
