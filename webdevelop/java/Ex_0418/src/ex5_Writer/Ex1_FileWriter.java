package ex5_Writer;

import java.io.FileWriter;

public class Ex1_FileWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/예제.txt",true);
			
			fw.write("첫번째 줄 작성합니다.\n");
			fw.write("두번째 줄도 문제없지");
			System.out.println("작성완료");
			
			fw.close();
		} catch (Exception e) {
			
		}

	}

}
