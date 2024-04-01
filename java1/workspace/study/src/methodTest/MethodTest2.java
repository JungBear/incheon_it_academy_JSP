package methodTest;

public class MethodTest2 {

	public int add(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTest2 mt = new MethodTest2();
		mt.add(2, 4);
		
		System.out.println(mt.add(2, 5));
		
		
	}

}
