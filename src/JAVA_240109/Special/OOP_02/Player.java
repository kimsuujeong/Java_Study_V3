package JAVA_240109.Special.OOP_02;

public interface Player {
	// GameLevel 속성을 가진다.
	// 각 GameLevel 단게 마다 run,jump,turn 기능이 업그레이드 된다

	static PlayerLevel level;
	
	static void Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	static PlayerLevel getLevel() {
		return level;
	}
	default void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
		
	}
	static void paly() {
		PlayerLevel.go(0);
	};
	
}
	
	