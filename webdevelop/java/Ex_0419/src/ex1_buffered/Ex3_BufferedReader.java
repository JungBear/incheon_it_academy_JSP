package ex1_buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex3_BufferedReader {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력 : ");
		String str = br.readLine();
		System.out.println("입력받은 값 : " + str);
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("정수 : " + num);


	}

}
