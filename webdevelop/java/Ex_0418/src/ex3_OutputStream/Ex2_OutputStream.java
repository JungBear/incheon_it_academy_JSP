package ex3_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_OutputStream {

	public static void main(String[] args) {
		/*
		 * FileInputStream과 FileOutputStream을 이용하여 이미지 복사하기
		 */
		String path = "C:\\Users\\mod45\\OneDrive\\바탕 화면\\incheon_it_academy_JSP\\webdevelop\\java";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// buffer를 쓰면 훨씬 빨라진다
		byte[] buffer = new byte[512];
		
		try {
			fis = new FileInputStream(path + "//wall.jpg");
			fos = new FileOutputStream(path + "/wall_copy.jpg");
			
			// 현재 시간을 m/s단위로 나타낸다
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			
			while((read = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, read);
			}
			
			System.out.println("이미지 읽기 종료");
			
			long end = System.currentTimeMillis();
			
			double time = (double) (end - start)/1000;
			System.out.println(time);
			
		} catch (Exception e) {
			
		} finally {
			try {
				if(fos != null) {					
					fos.close();
				}
				
				if(fis != null) {
					fis.close();					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
