package ex2_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 특정 경로에 file.txt로 만들고 아무 문장이나 이벽
 * flie.txt의 내용을 읽어와 문장이 회문인지 아닌지 판별
 */

public class Ex3_Work {

	public static void main(String[] args) {
		String path = "C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java/file.txt";
		
		File f = new File(path);
		byte[] b = new byte[(byte)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				
				fis = new FileInputStream(f);
				
				fis.read(b); 
				
				StringBuilder ori = new StringBuilder(new String(b));
				StringBuilder rev = ori.reverse();
				
				if(ori.equals(rev)) {
					System.out.println(ori + "는 회문입니다.");
				}else {
					System.out.println(ori + "는 회문이아닙니다.");
				}
				
			} catch (Exception e) {
				
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
