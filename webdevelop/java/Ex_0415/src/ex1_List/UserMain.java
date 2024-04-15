package ex1_List;

import java.util.ArrayList;
import java.util.Scanner;

/* 유저의 아이디와 패스워드를 가지는 UserInfo
   Main에서 유저의 정보를 ArrayList에 추가하여 출력
   ---결과---
   아이디 생성 : aaa
   패스워드 입력 : 1234
   aaa
   1234
   ----------
   아이디 생성 : aaa
   중복된 아이디
   아이디 생성 : bbb
   패스워드 입력 : 1234
   aaa
   1234
   --------
   bbb
   1234
   --------
*/
public class UserMain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		Scanner sc = new Scanner(System.in);
		
		outer:while(true) {
			UserInfo user = new UserInfo();
			
			System.out.print("아이디 생성 : ");
			user.setId(sc.next());
			
			// 중복 검사
			for (UserInfo ele : list) {
				if(ele.getId().equals(user.getId())){
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			
			System.out.print("패스워드 입력 : ");
			user.setPwd(sc.next());
			
			// 리스트에 추가
			list.add(user);
			
			// 출력
			for (UserInfo ele : list) {
				System.out.println(ele.getId());
				System.out.println(ele.getPwd());
				System.out.println("==========");
			}
			
			// 종료 조건
			if(list.size() == 2) {
				break;
			}
			
			
		}

	}

}
