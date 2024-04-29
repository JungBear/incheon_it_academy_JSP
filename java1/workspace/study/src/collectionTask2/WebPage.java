package collectionTask2;

public class WebPage {
	public static void main(String[] args) {
		UserService service = new UserService();
		
		User u1 = new User("hong", "qwer", "홍길동", 30);
		User u2 = new User("kim", "1234", "김길", 20);
		User u3 = new User("qasd", "qwer", "고길동", 25);
		User u4 = new User("good", "qwer", "홍길동", 30);
		
		service.signUp(u1);
		service.signUp(u2);
		service.signUp(u3);
		service.signUp(u4);
		
		// 로그인
		if(service.logIn("hong", "qwer") != null) {
			System.out.println("로그인에 성공하셨습니다");
		}else {
			System.out.println("존재하지 않는 아이디거나 올바르지 않는 비밀번호입니다.");
		}
		
		if(service.checkId("hong")) {
			System.out.println("이미 존재하는 아이디입니다");
		}else {
			System.out.println("생성 가능한 아이디 입니다");
		}
	}
}
