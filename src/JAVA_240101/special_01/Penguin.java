package special_01;

public class Penguin implements Bird {
	
	private int enegry = 100;

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		Bird.super.sound();
		
		System.out.println("²Ù¿¨");
		enegry -= 5;
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		Bird.super.move();
		System.out.println("Æë´Ù´Ú");
		enegry -= 10;
	}


	@Override
	public int getEnergy() {
		// TODO Auto-generated method stub
		//return Bird.super.getEnergy();
		return enegry;
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	public static void Penguins(String[] args) {
		Penguin penguin = new Penguin();
		
		penguin.sound();
		penguin.move();
		penguin.getEnergy();
		penguin.fly();
		
		
	}
	
	

}
