package JAVA_240101.special_01;

public class Lion implements Mammal {

	private int enegry = 100;

	@Override
	public void breastfeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		Mammal.super.sound();
		
		System.out.println("����");
		enegry -= 10;

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		Mammal.super.move();
		System.out.println("��ٴ�");
		enegry -= 20;
	}

	@Override
	public int getEnergy() {
		// TODO Auto-generated method stub
		return enegry;
		
	}
	
	public static void Lions(String[] args) {
		Lion lion = new Lion();
		
		lion.sound();
		lion.move();
		lion.getEnergy();
		lion.breastfeed();
		
	}
	
}
