package ex2_lamda;

public class CalMain {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		int res = cal1.plus(10, 20);
		System.out.println("cal1 : " + res);

		MyCalculator cal2 = new MyCalculator() {
			@Override
			public int plus(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		res = cal2.plus(10, 20);
		System.out.println("cal2 : " + res);
		
		MyCalculator cal3 = (num1, num2)->num1 + num2;
		res = cal3.plus(10, 20);
		System.out.println("cal3 : " + res);
		
		MyFunction mf = System.out::println;
		mf.method(3);
	}

}
