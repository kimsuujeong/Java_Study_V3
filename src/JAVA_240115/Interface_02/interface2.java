package JAVA_240115.Interface_02;

public interface interface2 {
	// 인터페이스와 다형성
	// 인터페이스 타입의 참조변수로 인터페이스를 구현한 클래스의
	// 인스턴스를 참조가 가능.
	
	// 인터페이스를 파라미터 타입으로 설정하는것도 가능.
	// 조건 : 파라미터로 올 수 있는 것은 인터페이스를 구현한 클래스만 가능
	public static void main(String[] args) {
		A gunchim = new A();
		B gunchim2 = new B();
		
		gunchim.gunchim(gunchim2);
	}
}
 