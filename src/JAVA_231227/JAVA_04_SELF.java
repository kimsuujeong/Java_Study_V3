package JAVA_231227;

import java.util.Random;

public class JAVA_04_SELF {

	public static class Character {

		String name;
		static int Level;
		static int XP; // 경험치
		int HP; // 체력
		
		public Character(String name, int hP) {
			super();
			this.name = name;
			HP = hP;
		}
		
		// =============== 캐릭터 생성 줄 ==================
		Character ch1 = new Character("군침이", 100);
		Character ch2 = new Character("뽀로로", 100);
		// ============================================
		
	}
	
	
	public static void levelUp(int Level, int XP) { // 메서드는 캐릭터의 레벨을 1 증가시키고, 경험치를 초기화해야 함

		Level += 1;
		XP = 0;

	}

	public static void battle() { // 메서드는 다른 캐릭터와 전투를 시뮬레이션하며,
		
		// 체력을 감소시킴 체력 감소 수치는 어떤경우에도 20(승패 상관없음)
		// 전투 결과는 랜덤으로 결정.
		// 1이면 승리 2면 패배로 설정
		Random random = new Random();
		
		boolean bt = random.nextBoolean();
		
		String result = (bt = true) ? "승리" : "패배" ;
		
		// ch1과 ch2가 전투에서 battle 했습니다.
		// ch1&2의 현재 체력 ch1의HP
		// random ch?의 레벨업
		// ch?가 현재 체력이 0 되면 게임 종료
		// ch1이 레벨업 했습니다. 현재 레벨:3
		// ch2이 레벨업 했습니다. 현재 레벨:3
		

	}

	public static void main(String[] args) {
		
		

	}
}
