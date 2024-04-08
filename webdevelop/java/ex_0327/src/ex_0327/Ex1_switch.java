package ex_0327;

public class Ex1_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		String message = null;
		switch(n) {
		case 1:
			message = "1. 게임하기";
			break;
		case 2:
			message = "2. 게임소개";
			break;
		case 3:
			message = "3. 종료";
			break;
		default:
			message = "디폴트";
		}
		
		System.out.println(message);
	}

}
