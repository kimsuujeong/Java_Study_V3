package JAVA_240109.Special.OOP_02;

public class Player {

	// playerLevel과 포함 관계
	private static PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.ShowLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	private void uppgradeLevel(PlayerLevel level) {
		this.level = level;
		level.ShowLevelMessage();
		// 재정의

	}
	public void paly(int count) {
		// TODO Auto-generated method stub
		level.go(count);

	}
	
	public static void main(String[] args) {
		Player player = new Player();
		level.go(1);
		
		AdvancedLevel advancedLevel = new AdvancedLevel();
		player.uppgradeLevel(advancedLevel);
		level.go(2);
		
		SuperLevel superLevel = new SuperLevel();
		player.uppgradeLevel(superLevel);
		level.go(3);
	}

}
