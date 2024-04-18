package ex2_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_FileInputStream {

	public static void main(String[] args) {
		String path = "C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/test.txt";
		
		File f = new File(path);
		
		FileInputStream fis = null;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				int code = 0;
				while((code = fis.read()) != -1) {
					System.out.print((char)code	);
				};
				
			} catch (Exception e) {
				e.printStackTrace();
			}	finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
