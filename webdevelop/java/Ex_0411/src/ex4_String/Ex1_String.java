package ex4_String;

import java.util.Arrays;

public class Ex1_String {

	public static void main(String[] args) {
		String str = "Kim Mal Ddong";
		
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("a의 인덱스 : " + str.indexOf('a'));
		System.out.println("인덱스 : " + str.indexOf("al"));
		
		System.out.println("5번째의 값 : " + str.charAt(5));
		
		System.out.println("0-3까지 잘라내기 : " + str.substring(0, 4));
		
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String n = "1004";
		int number = Integer.parseInt(n);
		System.out.println(number);
		
		String str2 = str.toLowerCase();
		System.out.println(str2);
		System.out.println(str.equalsIgnoreCase(str2));
		
		String str3 = "    trim    ";
		System.out.println(str3);
		System.out.println(str3.trim());
		
		System.out.println(str2.replace('k', 'j'));
		
		

	}

}
