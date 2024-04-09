package ex2_inner_class;

class PrintOut{
	
	private int val1;
	private static int val2 = 1;
	
	
	public static class Out{
		public void println(String str) {
			System.out.println(str);
			System.out.println(val2);
		}
	}
}

public class StaticClassExample {
	public static void main(String[] args) {
		
		String str = "정적 내부 클래스 테스트";
		
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
	}
	
}
