package collectionTest;

public class ForeachTest {

	public static void main(String[] args) {
		int[][] numbers = {{50, 70, 100},{1, 8, 6}};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		
		for (int[] is : numbers) {
			for (int n : is) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
