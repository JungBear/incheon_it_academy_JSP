package ambiguityTest;

public class ClassB extends ClassA implements InterfaceA{

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		super.printData();
	}
	
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.printData();
	}
}
