package ex3_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1_FileOutputStream {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/fileOut.txt";

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(path);
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');

			String msg = "fileOutput 예제입니다.\n";
			String msg2 = "여러줄도 가능";			
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
