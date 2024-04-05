package ex_0405;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		
		
		System.out.println(cal.getResult(1, 3));
		System.out.println(cp.getResult(1, 3));
		System.out.println(cm.getResult(1, 3));
		

	}

}
