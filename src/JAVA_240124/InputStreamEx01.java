package JAVA_240124;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamEx01 {

	public static void main(String[] args) throws IOException {
		// 바이트 기반 스트림 - 파일에서 바이트를 읽고 쓰고 할 때 사용
		// read : 입력스트림으로 부터 1바이트를 읽고 읽은 바이트를 리턴.
		// read(byte[] b) : 
		// InputStream -> 인터페이스 추상으로도 쓰이기도 함
		// FileInputStream
		// OutputStream
		// FileOutputStream
		
		// 파일로 부터 문자열 읽을 때 사용.
		// fileReader
		// fileWriter
		
		InputStream iStream = 
				new FileInputStream("C:\\gunchim\\test.txt");
		
		
		int readByte;
		byte[] b = new byte[2];
		// InputStream 클래스의 read 메서드는 
		// 더이상 읽을게 없는경우는 -1을 리턴.
		while( (readByte = iStream.read(b)) != -1) {
			System.out.println("읽은 바이트 수 : " + readByte);   //아스키코드값을 출력
			String s = new String(b);
			System.out.println("읽은 문자 : " + s); //강제타입캐스팅 후 문자를 출력			
		}
		
		String data = "ABC테스트";
		System.out.println(new String(data.getBytes("utf-8"),"UTF-8"));
		// 바이트 수에도 utf-8을 지정해 줘야 한다.
		System.out.println(new String(data.getBytes(),"EUC-KR"));
		
//		while(true) {
//		readByte = iStream.read();
	//		if(readByte == -1) {
	//			break;
	//		}
//		System.out.println("읽은 바이트 수 : " + readByte);   //아스키코드값을 출력
//		System.out.println("읽은 문자 : " + (char)readByte); //강제타입캐스팅 후 문자를 출력	
//	}
		System.out.println(Charset.defaultCharset());
		
		iStream.close();
	}
}