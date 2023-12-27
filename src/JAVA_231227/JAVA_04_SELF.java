package JAVA_231227;

import java.util.Random;

public class JAVA_04_SELF {

	public static class Character {

		String name;
		static int HP; // 체력
		static int Level; // 레벨
		static int XP; // 경험치

		public Character(String name, int hP, int Level, int XP) {
			super();
			this.name = name;
			hP = 100;
			Level = 1; // 메서드는 캐릭터의 레벨을 1 증가시키고, 경험치를 초기화해야 함
			XP = 0;

		}

	}

	public static void score() { // 승&패 여부 확인
		Random random = new Random();

		int bt = random.nextInt(2);

		String result = (bt == 1) ? "승리" : "패배";

		if (result == "승리") { // 승리하면 HP는 20 깎이지만 경험치 20 올라감
			Character.HP -= 20;
			Character.XP += 50;
		} else { // 지면 그냥 HP만 깎임
			Character.HP -= 20;
		}

		System.out.println(result);

	}

	public static void battle() { // 메서드는 다른 캐릭터와 전투를 시뮬레이션하며,
		
		while(Character.HP == 0) { //HP가 0이 되면 끝남
			
		}
		// ch1과 ch2가 전투에서 battle 했습니다.
		// ch1&2의 현재 체력 ch1의HP
		// random ch?의 레벨업

	}

	public static void main(String[] args) {
		
		// =============== 캐릭터 생성 줄 ==================
		// 아룸, 체력, 레벨, 경험치
		Character ch1 = new Character("군침이", 100, 1, 0);
		Character ch2 = new Character("뽀로로", 100, 1, 0);
		// ============================================
		
		
		score();
		
		// ch1이 레벨업 했습니다. 현재 레벨:3
		// ch2이 레벨업 했습니다. 현재 레벨:3

	}

}
