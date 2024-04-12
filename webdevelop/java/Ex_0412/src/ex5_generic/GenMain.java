package ex5_generic;

public class GenMain {

	public static void main(String[] args) {
		
		Integer[] iarr = {1, 2, 3, 4, 5};
		Double[] darr = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] carr = {'A', 'B', 'C', 'D', 'E'};
		
		Gen g = new Gen();
		g.printArr(iarr);
		System.out.println("===================");
		
		g.printArr(darr);
		System.out.println("===================");

		g.printArr(carr);

	}

}
