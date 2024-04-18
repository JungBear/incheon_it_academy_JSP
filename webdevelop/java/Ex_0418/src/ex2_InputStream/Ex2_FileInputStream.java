package ex2_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex2_FileInputStream {

	public static void main(String[] args) {
		String path = "C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/test.txt";
		
		File f = new File(path);
		
		byte[] b = new byte[(int)f.length()];
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				fis.read(b); 
				
				String msg = new String(b);
				System.out.println(msg);
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
