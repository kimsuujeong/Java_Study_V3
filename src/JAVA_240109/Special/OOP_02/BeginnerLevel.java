package JAVA_240109.Special.OOP_02;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 못하지롱");
	}

	@Override
	public void turn() {
		System.out.println("trn 못하지롱");
	}

	@Override
	public void ShowLevelMessage() {
		System.out.println("****** 초급자 레벨입니다. ******");
	}

}
