package ex6_abstract;


public class AbsMain {

	public static void main(String[] args) {
		
		
		AbsParent ac = new AbsChild();
		ac.setValue(20);
		System.out.println("===");
		System.out.println(ac.getValue());

	}

}
