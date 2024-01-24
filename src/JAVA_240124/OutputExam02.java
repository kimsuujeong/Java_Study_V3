package JAVA_240124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExam02 {

	public static void main(String[] args) throws IOException {
		// 기존 파일 경로
		String origin = "C:\\Users\\theha\\OneDrive\\문서\\gunchim.xlsx";
		// 복사할 파일 경로
		String target = "C:\\Users\\theha\\OneDrive\\문서\\gunchim2.xlsx";

		File file = new File(origin);
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(target);

		byte[] barr = new byte[100];
		int readByteCount;
		int i = 0;

		while ((readByteCount = fis.read(barr)) != -1) {
			fos.write(barr, 0, readByteCount);
			// write 메서드 : 출력스트림에 1바이트를 전송
			i++;
		}
		
		System.out.println("루핑수: "+ i );
		
		fis.close();
		fos.close();
		System.out.println("파일 복사 완료");

	}

}
