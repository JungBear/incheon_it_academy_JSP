package ex4_String;

import java.util.Scanner;

public class Ex2_String {

	public static void main(String[] args) {
		String s = "   H e l l o    ";
		System.out.println(s.replace(" ", ""));
		
		//키보드에서 무작위로 입력을 받고
		//입력받은 문자열에서 소문자 a가 몇개 있는지 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력해주세요 : ");
		String str = sc.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a의 갯수 : " + count);

		
		//키보드에서 세글자 이상의 단어를 입력받은 뒤
		//회문인지 아닌지 판별하는 코드 작성
		
		//회문은 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 단어, 문장
		
		System.out.print("입력해주세요 : ");
		String str1 = sc.next();
		char[] arr = str1.toCharArray();
		//System.out.println(arr);
		String str2 = "";
		for (int i = arr.length-1; i >= 0; i--) {
			str2 += str1.charAt(i);
		}
		//System.out.println("str2 : " + str2);
		
		if(str1.equals(str2)) {
			System.out.println("회문이 맞습니다.");
		}else {
			System.out.println("회문이 아닙니다.");
		}
		
	
	}

}
