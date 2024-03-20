package operTest;

public class Oper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isTrue = 10 != 11;
		
//		Q. ||을 쓰지 말고 결과를 true로 바꿔보기
		System.out.println(isTrue && !(10 != 10));
	
	}

}
