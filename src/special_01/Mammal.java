package special_01;

public interface Mammal extends Animal{
	
	// 사자는 '어흥'하고 울고 에너지 10을 소모한다. 달리면 20 에너지를 소모한다. //Mammal 포유류

	
	@Override
	default void sound() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	default void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default int getEnergy() {
		// TODO Auto-generated method stub

		return 100;
	}
	
	void breastfeed(); // 젖을 맥임
	
	 //	 * "Lion" 클래스는 "Mammal" 인터페이스를,
	

}
