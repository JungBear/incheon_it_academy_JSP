package ex4_Reader;

import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {

	public static void main(String[] args) {
		// 자바에서는 char형을 통해 문자를 저장
		// 1byte 단위로 처리하는 바이트 기반 스트림은 모든 파일을 다룰 수 있으나
		// 문자를 처리하는 char형의 크기는 2byte로 별도의 처리를 하지않으면
		// 정상적으로 읽지 못하는 경우가 있다.
		// 이때 문자 기반의 스트림을 사용하면 간단하게 문자를 처리할 수 있다.
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/test.txt");
			
			int read = 0;
			while((read = fr.read()) != -1) {
				System.out.print((char)read);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
