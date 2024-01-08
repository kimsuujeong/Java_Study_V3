package JAVA_240105;

import java.util.Arrays;

public class JAVA_06 {

	public static int[] show (int [] numbers, int num1, int num2) {
		
		int[] result = new int[num2-num1+1];
		
        int index = 0;
        
        for (int i = num1; i <= num2; i++) {
            result[index++] = numbers[i];
        }

        return result;
        
    }



	public static void main(String[] args) {

		show(new int[] { 1, 2, 3, 4, 5 }, 1, 3);
		System.out.println(Arrays.toString(show(new int[] { 1, 2, 3, 4, 5 }, 1, 3)));

	}

}
