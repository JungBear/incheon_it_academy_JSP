package ex1_File;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/aaa/bbb";
		
		File f = new File(path);
		
		if(!f.exists()) {
			System.out.println("폴더 생성");
			//mkdir() 폴더 하나만
			//mkdirs() 폴더 여러개
			f.mkdirs();
		}

	}

}
