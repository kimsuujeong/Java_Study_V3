package JAVA_240119;


// 제네릭을 사용하는 방법.
public class kDigital3th<T> {
	
	// T는 타입이 정해지지 안흔 상황이며,
	// 이 클래스를 사용할 때 정해진다.
	// static을 쓰면 안돼!!
	// 제네릭을 사용할 때 getter/setter을 넣어야함
	private T t;
	
	public kDigital3th() {
		
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
