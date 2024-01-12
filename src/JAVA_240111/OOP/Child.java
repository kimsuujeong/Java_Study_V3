package JAVA_240111.OOP;

public class Child extends Supers{
	
	int a = 9724;
	
	public child() {
		System.out.println("생성자 호출!");
	}
	
	@Override
	public void Supers() {
		System.out.println("1번" + a );
		System.out.println("2번" + this.a);
		System.out.println("3번" + super.a);
	}

}
