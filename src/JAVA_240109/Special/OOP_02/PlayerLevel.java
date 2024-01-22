package JAVA_240109.Special.OOP_02;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void ShowLevelMessage();
	
	// private로 설정 했으나,
	// 재정의가 안됨으로 final을 설정한다.
	final void go (int count) {
		run();
		for (int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
	

}
