package ex_0401;

public class Ex1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 향상된 for문
		int[] ar = {1, 2, 3};
		int sum = 0;
		double avg = 0;
		for (int ele: ar) {
			sum += ele;
		}
		
		avg = (double) sum / ar.length;
		System.out.println("avg : " + avg);
		
		int[][] arr = {{1, 2, 3}, {4,5}, {6, 7, 8}};
		
		for(int[] ele : arr) {
			for(int val : ele) {
				System.out.println(val);
			}
		}
	}

}
