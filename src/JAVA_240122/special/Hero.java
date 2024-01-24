package JAVA_240122.special;

abstract class Hero {
	String name;

	public Hero(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	abstract void useSpecialAbility();
}
class Superman extends Hero{

	public Superman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void useSpecialAbility() {
		System.out.print("아따 슈퍼맨이 하늘을 난당께!");
	}
	
}

class Spiderman extends Hero{

	public Spiderman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void useSpecialAbility() {
		System.out.print("아따 스파이더맨이 건물을 타고 움직인당께!");
		
	}
	
}

class Ironman extends Hero{

	public Ironman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void useSpecialAbility() {
		System.out.print("아따 아이언맨이 로봇 슈트를 조종한당께!");
		
	}
	
}