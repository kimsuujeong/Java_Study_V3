package special_01;

public interface Animal {

	void sound(); // 동물이 울음소리를 내는 메소드

	void move(); // 동물이 움직이는 메소드

	int getEnergy(); // 동물의 현재 에너지를 반환하는 메소드

	// 사자는 '어흥'하고 울고 에너지 10을 소모한다. 달리면 20 에너지를 소모한다. //Mammal 포유류
	// 펭귄은 '꾸엑'하고 울고 에너지 05를 소모한다. 걸을때 10 에너지를 소모한다. // Bird 새

	//

	/*
	 * [퀴즈] 동물원의 동물들의 행동과 에너지
	 */

	public static void main(String[] args) {
		Penguin penguin = new Penguin();
		Lion lion = new Lion();

		for (int i = 0; i < 3; i++) {
			penguin.sound();
			penguin.move();
			lion.sound();
			lion.move();
		}
		

		System.out.println("펭귄 체력임 : " + penguin.getEnergy());
		System.out.println("사자 체력임 : " + lion.getEnergy());

	}

}
