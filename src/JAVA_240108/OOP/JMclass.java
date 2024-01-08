package JAVA_240108.OOP;

public class JMclass {
	int hp = 100;
	int mp = 100;
	int age = 20;
	double height = 177.3;
	String gender = "사나이";
	String mbti = "INTJ";
	String bType = "B";



	public void swingBat() {
		System.out.println("빠따 휘둘루기기ㅣㅣㅇ");
	}

	public void rest() {
		this.mp++;
		smoke();
	}

	private void smoke() {
		System.out.println("뻐꿈뻐꿈");
	}
	
	public static void main(String[] args) {
		JMclass jm = new JMclass();
		JMclass jm2 = new JMclass();
		
		jm.rest();
		System.out.println(jm.mp);
	}
}
