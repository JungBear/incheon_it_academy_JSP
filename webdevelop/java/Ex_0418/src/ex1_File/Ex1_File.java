package ex1_File;

import java.io.File;

public class Ex1_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/test.txt";
		
		File f = new File(path);
		
		if(f.isFile()) {
			System.out.println(f.length() + "byte");
		}
		

	}

}
