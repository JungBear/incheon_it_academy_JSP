package ex2_inner_class;

class Calulator{
	private int val1;
	private int val2;
	
	public Calulator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	// 인스턴스클래스
	public class Calc{
		public int add () {
			return val1 + val2;
		}
	}
	
}

public class InstanceClassExample {
	public static void main(String[] args) {
		
		Calulator cal = new Calulator(2, 4);
		
		Calulator.Calc c = cal.new Calc();
		
		System.out.println("합 : " + c.add());
	}
	
}
