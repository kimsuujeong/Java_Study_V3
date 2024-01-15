package JAVA_240112;

public class JAVA_01 {

	public static void main(String[] args) {
		
        int num_ln = 9;

        for (int i = 1; i <= num_ln; i++) {
        	int cnt = 1;
        	for(int j=i; j <= num_ln; j++) {
        		System.out.print(".");
            }
        	for(int j=i; j<= num_ln; j++) {
        		System.out.print(cnt++);
        	}
            System.out.println();
        }

    }
}