package JAVA_240124;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExam {

	public static void main(String[] args) throws IOException {
		// Reader : 문자 읽기에 특화되어 있는 클래스
		// - 하위 클래스 FileReader을 생성 후 대입.
		FileReader reader = new FileReader("C:\\Users\\theha\\OneDrive\\바탕 화면\\JAVA_STUDY_EX\\Java_Study_V3\\src\\JAVA_240124\\군침이 사악도노;.txt");
		int readData;
		
		while((readData = reader.read()) != -1) {
	         System.out.println("읽은 문자 : " + (char)readData);
	         System.out.println("읽은 문자 : " + readData);
	      }
		
		reader.close();
	}
}
