package JAVA_240115;

public class JAVA_01 {
	public void exceptionMethod() throws Exception {
		throw new Exception(); // 예외 객체를 임의로 발생시켜 주는 예약어
	}

	/**
	 * throws 테스트
	 */
	public static void main(String[] args) {

		JAVA_01 et6 = new JAVA_01();
		
		try {
			
			et6.exceptionMethod();
			
		} catch (Exception e) {
			
			System.out.println("호출한 메소드에서 예외 처리함");
		
		}
	}
}
