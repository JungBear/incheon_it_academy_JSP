package methodTest;

public class MethodTest3 {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTest3 mt = new MethodTest3();
		
		int result = mt.add(10, 1);
		System.out.println("결과값 : " + result);	
		
		
	}

}
