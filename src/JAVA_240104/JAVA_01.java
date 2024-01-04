package JAVA_240104;

public class JAVA_01 {

	public static void main(String[] args) {
		int[][] array = new int[][] { 
			{ 10, 20, 30 }, 
			{ 40, 50, 60 }, 
			{ 70, 80, 90 }, 
			{100} };

		for (int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		
	}

}
