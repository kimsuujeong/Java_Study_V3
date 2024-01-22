package JAVA_240122;

import java.util.Arrays;
import java.util.List;

public class JAVA_01 {
	
	public static void main(String[] args) {
		List<Integer> list2 = Arrays.asList(10,20,30);
		
		// arr -> arr1
		Integer[] arr = (Integer[])list2.toArray();
		int[] arr1;
		for (Integer integer : arr) {
			
		}
		
		System.out.println(list2);
	}

}
