package arrayTest;

public class ArrTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arrData = {{3,4,5,6}, {8,9,10,11}, {1,2,3,4}};
		
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}
		
		int[][] arrData1 = {{3, 4, 5, 6, 7}, {8, 9, 10, 11}, {1, 2, 3}};
		int length = 0;
		
		for (int i = 0; i < arrData1.length; i++) {
			length += arrData1[i].length;
		}
		System.out.println(length);

	}

}
