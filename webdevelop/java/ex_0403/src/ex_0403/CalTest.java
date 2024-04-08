package ex_0403;

public class CalTest {
	
	
	public double getResult(int num1, int num2, String oper) {
		double result = 0;
		switch(oper) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / (double) num2;
			break;
			
		}
		return result;
	}

}
