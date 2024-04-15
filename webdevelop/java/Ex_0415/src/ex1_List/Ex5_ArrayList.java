package ex1_List;

import java.util.ArrayList;
import java.util.Scanner;

//아이디 생성 : abc
//abc 
//아이디 생성 : abc
//중복된 아이디 
//아이디 생성: abc3
//abc abc2 abc3

//아이디가 3개가 만들어 지면 프로그램 종료
public class Ex5_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> idList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String id = "";
		
		while(idList.size() < 3) {
			System.out.print("아이디 생성 : ");
			id = sc.next();
			
			if(idList.contains(id)) {
				System.out.println("중복된 아이디");
				continue;
			}
			
			idList.add(id);
			
			for (String ele : idList) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
		

	}

}
