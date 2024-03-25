package ex1_casting;

public class Ex1_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isTrue = true;
		System.out.println(isTrue);
		
		System.out.println("----------------------------------");
		
		char ch = 'A';
		System.out.println(ch);
		ch = 64;
		System.out.println(ch);
		System.out.println("----------------------------------");
		
		float f1 = 1.1f;
		System.out.println(f1);
		
		int su1 = 20;
		int su2 = 30;
		System.out.println("변경전");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		int temp = su2;
		su2 = su1;
		su1 = temp;
		
		System.out.println("변경후");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		
		
	}

}
