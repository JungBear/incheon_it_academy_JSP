package ex1_buffered;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex2_OutputStreamWriter {

	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter os = null;
		
		try {
			out = new FileOutputStream("C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/streamWriter.txt");
			os =  new OutputStreamWriter(out, "UTF-8");
			
			System.out.println("파일 생성시작");
			String[] strArray = {"집에 가고 싶다.\n", "증말루"};
			for(String str  : strArray) {
				os.write(str);
			}
			System.out.println("파일 생성 완료");
			
			
			
		} catch (Exception e) {

		} finally {
			try {
				if(os != null) {
					os.close();
				}
				
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
	
			}
		}

	}

}
