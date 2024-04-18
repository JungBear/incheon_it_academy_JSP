package ex6_buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex3_BufferedReader {

	public static void main(String[] args) {
		// 문장 단위로 데이터를 읽거나 쓸 수 있다

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\나만의 이론정리\\java/0409.md");
			br = new BufferedReader(fr);
			
			String str = "";
			while ((str = br.readLine())!= null) {
				System.out.println(str);
			}
					
		} catch (Exception e) {
			
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
