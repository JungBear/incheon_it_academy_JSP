package collectionTask2;

import java.util.ArrayList;

public class UserService {
/*
 * arrayList 만들기
 * id중복검사
 * 회원가입
 * 로그인
 * 
 */
	
	public static ArrayList<User> users = new ArrayList<User>();
	
	// 회원가입
	public void signUp(User user) {
		users.add(user);
	}
	
	// 로그인
	public User logIn(String id, String pwd) {
		for (User user : users) {
			if(user.getId().equals(id)) {
				if(user.getPwd().equals(pwd)) {
					return user;
				}
			}
		}
		return null;
	}
	
	// id중복검사
	public boolean checkId(String id) {
		for (User user : users) {
			if(user.getId().equals(id)) {
				return false;
			}
		}
		return true;
	}
	

	
}
