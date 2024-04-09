package ex5_try_catch;

public class Ex1_try_catch {

	public static void main(String[] args) {
		
		int result = 0;
		
		try {
			result = 10 / 0;
			System.out.println("나누기 결과 : " + result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}

	}

}
