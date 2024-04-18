package ex6_buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex1_BufferedInput {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/test.txt");
			bis = new BufferedInputStream(fis);
			
			int read = 0;
			while((read = bis.read()) != -1) {
				System.out.println((char)read);
			}
			
			bis.close();
			fis.close();
			
	
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
