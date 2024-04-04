package ex_0404;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p1 = new Phone("갤럭시", 24, "흰색");
		Phone p2 = new Phone("아이폰",15);
		
		p1.phoneInfo();
		System.out.println("================");
		p2.phoneInfo();
		
		
	}

}
