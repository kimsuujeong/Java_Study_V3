package JAVA_240109.OOP;

public class CapsuleExam {

	private String test1;

	CapsuleExam(String test1) {
		this.test1 = test1;
	}

	private void sick() {
		System.out.println("아파욤"); 
	}

	void test2() {
		System.out.println("호출 잘 되나");
	}

	public static void main(String[] args) {
		// 캡슐화
		// 접근 제어 지시자
		// - 객체지향 캡슐화를 구현하기 위한 자바에서 제공하는
		// 키워드(클래스, 변수, 메서드등의 접근범위를 지정)

		// public, protected, default(package), private
		// private - 접근범위가 클래스 내부로 제한
		// default - 접근범위가 같은 패키지 내부로 제한
		// protected - 접근범위가 같은 패키지 내부로 제한
		// public - 프로젝트 내부라면 어디서든지 접근 가능.
	}

}
