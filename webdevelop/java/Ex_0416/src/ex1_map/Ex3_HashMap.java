package ex1_map;

import java.util.HashMap;
import java.util.Scanner;

/*
 * id : aaa
 * pw : 111
 * 아이디가 존재하지 않습니다.
 * id : lee
 * pw : 3333
 * 비밀번호 불일치
 * id : park
 * pw : 3333
 * 로그인 성공
 */

public class Ex3_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		while(true) {
			
			System.out.print("id : ");
			String id = sc.next();
			
			System.out.print("pw : ");
			int pwd = sc.nextInt();
			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 않습니다.");
				continue;
				
			}else {
				if(map.get(id) != pwd) {
					System.out.println("비밀번호 불일치");
					continue;
					
				}else {
					System.out.println("로그인 성공");
					break;
				}
			}

		}
		

	}

}
