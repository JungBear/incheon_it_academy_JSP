package ex4_exception;

public class Ex2_Exception {

	public static void main(String[] args) {
		// NumberFormatException
		
		String str1 = "11";
		String str2 = "11.1";
		
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);

		try {
			int num2 = Integer.parseInt(str2);
			System.out.println(num1);
		} catch (NumberFormatException e) {
			System.out.println("에러발생 : " + e);
		}

		
	}

}
