package castingTest;

public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 8.43, num2 = 2.59;
		
//		Q. 8.43 + 2.59 = 10
		System.out.println((int)8.42 + (int)2.59);
		System.out.println((int)(8.42 + (int)2.59));
		System.out.println((int)((int)8.42 + 2.59));
		
		System.out.println((int)num1 + (int)num2);
		
	}
}