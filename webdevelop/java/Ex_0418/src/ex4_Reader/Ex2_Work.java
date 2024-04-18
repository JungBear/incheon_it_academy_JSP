package ex4_Reader;

import java.io.FileReader;

public class Ex2_Work {

	public static void main(String[] args) {
		/*
		 * test.txt에 아무렇게나 적는다
		 * test.txt의 내용을 읽어서 알파벳 대문자와 소문자의 갯수를 출력
		 * 
		 * 대문자 : X개
		 * 소문자 : X개
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/test.txt");
			
			int code = 0;
			String ori = "";
			int lowerCount = 0;
			int upperCount = 0;
			
			while((code = fr.read()) != -1) {
				if(Character.isLowerCase((char)code)) {
					lowerCount++;
				}
				
				if(Character.isUpperCase((char)code)) {
					upperCount++;
				}
			}
			
			
			System.out.println("대문자 : " + upperCount + "개");
			System.out.println("소문자 : " + lowerCount + "개");

		} catch (Exception e) {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
