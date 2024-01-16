package JAVA_240115.Interface_02;

public class A {
	
	// 인터페이스를 파라미터 타입으로 설정하는 예시
	public void gunchim(B b) {
		b.gunchim();
	}
	
	// 인터페이스를 파라미터 타입으로 설정하는 예시
	// 어디서 누가 만든 것 혹은 어떠한 내장 클래스도 상관 없이
	// 다형성을 이용해서 파라미터로 인스턴스를 받고 싶으면
	// 어떤 클래스(타입)으로 만들면 어떠할까?
	public void gunchim(In i) {
		i.gunchim();
	}

}
