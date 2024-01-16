package JAVA_240116;

public interface Animal {
	void getName();
	void reserveAppointment();
	
	public static void main(String[] args) {
		Dog dog = new Dog(15);

	}
	
}

class Dog implements Animal {
	
	int availableTime;
	
	public Dog(int availableTime) {
		this.availableTime = availableTime;
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reserveAppointment() {
		// TODO Auto-generated method stub
		if ( availableTime > 12) {
			System.out.println("해당 시간은 예약이 불가능합니다");
		}
	}
	
}

class Cat implements Animal {
	
	int availableTime;

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reserveAppointment() {
		// TODO Auto-generated method stub
		
	}
	
}

class Bird implements Animal {
	
	int availableTime;

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reserveAppointment() {
		// TODO Auto-generated method stub
		
	}
	
}
