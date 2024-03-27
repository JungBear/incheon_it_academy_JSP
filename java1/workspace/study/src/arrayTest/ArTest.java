package arrayTest;

public class ArTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arData = {1, 3, 4, 5, 2};
		System.out.println(arData);
		System.out.println("-------------");
		
		System.out.println(arData.length);
		System.out.println("-------------");
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		System.out.println("-------------");
		
//		arData에 5, 4, 3, 2, 1을 순서대로 담은 후 출력
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = arData.length - i;
			System.out.println(arData[i]);
		}

	}

}
