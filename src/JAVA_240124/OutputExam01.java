package JAVA_240124;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OutputExam01 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\theha\\OneDrive\\바탕 화면\\JAVA_STUDY_EX\\Java_Study_V3\\src\\JAVA_240124\\군침이 사악도노;.txt");
		FileInputStream fos = new FileInputStream(
				"C:\\Users\\theha\\OneDrive\\바탕 화면\\JAVA_STUDY_EX\\Java_Study_V3\\src\\JAVA_240124\\군침이 사악도노;.txt");

		byte[] readBytes = new byte[1000];
		int data = 0;

		while ((data - fis.read(readBytes)) != -1) {
			fos.write(readBytes);
		}
	}
}
