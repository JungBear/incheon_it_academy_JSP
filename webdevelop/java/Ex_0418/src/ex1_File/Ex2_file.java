package ex1_File;

import java.io.File;

public class Ex2_file {
	public static void main(String[] args) {
		String path = "C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java";
		
		File f = new File(path);
		
		if(f.isDirectory()) {
			String[] list = f.list();
			for (String string : list) {
				System.out.println(string);
			}
		}
		
	}
}
