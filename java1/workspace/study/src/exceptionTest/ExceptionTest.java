package exceptionTest;

public class ExceptionTest {

	public static void main(String[] args) {
//		try {
//		System.out.println(10/0);
//		} catch (ArithmeticException e) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		}

		
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			System.out.println(e);
//		} finally {
//			
//		}
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("배열의 인덱스를 확인하세요.");
		} finally {
			System.out.println("반드시 실행");
		}
		
		
		
		
		
	}

}
