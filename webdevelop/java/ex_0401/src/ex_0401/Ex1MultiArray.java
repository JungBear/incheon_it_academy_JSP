package ex_0401;

public class Ex1MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다차원 배열
		// 2차원배열
		int[][] arr = { {1, 2}, {4, 5, 6}, {8, 9, 10, 11} };
		
		System.out.println("arr.length : " + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
