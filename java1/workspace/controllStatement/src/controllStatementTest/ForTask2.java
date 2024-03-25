package controllStatementTest;

public class ForTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		1~100까지
		for(int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("------------------------------");
		
//		100~1까지		
		for(int i = 0; i < 100; i++) {
			System.out.println(100-i);
		}
		
		System.out.println("------------------------------");
		
//		1~100까지 짝수만 출력
		
		for(int i = 0; i < 100; i += 2) {
			System.out.println(i+2);
		}
		
//		for(int i = 0; i < 50; i++) {
//			System.out.println((i+1)*2);
//		}
		
		System.out.println("------------------------------");
		
//		1~10까지 합 출력
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			sum += i + 1;
		}
		
		System.out.println("sum : " + sum);

		System.out.println("------------------------------");
		
//		A~F까지 출력
		
//		for(int i = 65; i<71; i++) {
//			System.out.printf("%c",i);
//		}
		
		for(int i = 0; i<6; i++) {
			System.out.print((char)(i+65));
//			System.out.printf("%c",i+65);
		}
		
		System.out.println("\n------------------------------");
		
		
		
//		A~F까지 중 C빼고 출력
		for(int i = 0; i<6; i++) {
			i = i == 2 ? 3 : i;
			System.out.print((char)(i+65));
		}
		
	}

}
