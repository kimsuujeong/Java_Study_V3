package special_01;

public interface Bird extends Animal{
	// 펭귄은 '꾸엑'하고 울고 에너지 05를 소모한다. 걸을때 10 에너지를 소모한다. // Bird 새
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
	
	void fly(); // 날아댕김
	

	
}
