package ex2_lamda;

@FunctionalInterface
interface Iadd{
	int add(int x, int y);
}

public class Calculator2 {

	public static void main(String[] args) {
		Iadd add = (x, y) -> x + y;
		int res = result(add);
		System.out.println(res);
		System.out.println("=============");
		
		res = result((x, y) -> x + y);
		System.out.println(res);
	}
	
	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}

}
