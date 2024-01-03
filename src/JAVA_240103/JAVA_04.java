package JAVA_240103;

public class JAVA_04 {
	
	public static void main(String[] args) {
		// 1부터 50까지 6의 배수만 출력
		int i = 0;
		int j = 0;
		while(i<60) {
			i++;
			if(i%6==0) {
				System.out.println(i);
			}
		}
	}

}
