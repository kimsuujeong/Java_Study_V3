package JAVA_240124;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx02 {
	
	public static void main(String[] args) throws FileNotFoundException{
		InputStream isStream
		= new FileInputStream("C:\\Users\\theha\\OneDrive\\바탕 화면\\JAVA_STUDY_EX\\Java_Study_V3\\src\\JAVA_240124\\군침이 사악도노;.txt");
		
		int count = 0;
		byte[] readBytes = new byte[10];
		
		try {
			count = isStream.read(readBytes, 2, 5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("읽은 바이트 수 : " + count);
		
		for (byte b : readBytes) {
			System.out.println("읽은 바이트" + (char)b);
		}
		
		// 스트림은 사용후에 반드시 종료해 둘 것
		try {
			isStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
