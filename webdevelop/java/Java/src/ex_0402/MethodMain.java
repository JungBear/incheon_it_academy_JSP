package ex_0402;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTest mt = new MethodTest();
		
		System.out.println(mt.add(3, 4));
		System.out.println("-------");
		
		mt.oneToN(10);
		System.out.println("-------");
		
		mt.multi(9);
		System.out.println("-------");
		
		int[] arr = {1, 6, 9, 2, 5, 3, 7, 4};
		
		mt.maxFinder(arr);
		System.out.println("-------");
		
		System.out.printf("원의 넓이 : %.2f\n",mt.circleArea(5.2));
		mt.circleRound(3);
	}

}
