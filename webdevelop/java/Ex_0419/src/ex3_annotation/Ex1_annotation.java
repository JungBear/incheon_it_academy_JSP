package ex3_annotation;

@FunctionalInterface
interface f{
	public void iAdd();
}

@SuppressWarnings("unused")
public class Ex1_annotation {
	public static void main(String[] args) {
		add();
		
		int num = 10;
	}
	
	@Deprecated
	public static void add() {
		System.out.println("hi");
		
	}
}
