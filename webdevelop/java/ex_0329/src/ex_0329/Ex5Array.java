package ex_0329;

public class Ex5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		int[] varArray = {1, 2, 3, 4, 5};
		
		System.out.println("intArray[0] : " + intArray[0]);
		System.out.println("intArray[1] : " + intArray[1]);
	
		System.out.println("strArray[0] : " + strArray[0]);
		System.out.println("strArray[1] : " + strArray[1]);
		
		System.out.println("varArray[0] : " + varArray[0]);
		System.out.println("varArray[1] : " + varArray[1]);
		
		System.out.println("-----------------------------");
		
		int[] iArr = new int[4];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (i + 1) * 100 ;
			System.out.println(iArr[i]);
		}
		
		
	}

}
