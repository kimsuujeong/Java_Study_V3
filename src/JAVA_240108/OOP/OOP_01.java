package JAVA_240108.OOP;

public class OOP_01 {
	
	public static void main(String[] args) {
		int[] gunchim = new int[3];
		
		JMclass[] jm = new JMclass[3];
		// JMclass 참조 자료형 배열을 생성
		// JMclass의 인스턴트만 배열에 저장이 가능.
		jm[0] = new JMclass();
		System.out.println(gunchim);
	}

}
