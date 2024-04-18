package ambiguityTest;

public class ClassC implements InterfaceA, InterfaceB{
	
	@Override
	public void printData() {
		// TODO Auto-generated method stub
		InterfaceA.super.printData();
	}

}


