package ex5_generic;

public class GenMain {

	public static void main(String[] args) {
		
		Integer[] arr1 = {1, 2, 3, 4, 5};
		Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] arr3 = {'A', 'B', 'C', 'D', 'E'};
		
		Gen g = new Gen();
		g.printArr(arr1);
		System.out.println("===================");
		
		g.printArr(arr2);
		System.out.println("===================");

		g.printArr(arr3);

	}

}
