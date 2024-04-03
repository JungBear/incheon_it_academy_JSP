package classTest;

class A{
	int data;
	
	void printData() {
		System.out.println(data);
	}
	
	public A() {
		
	}

	public A(int data) {
		super();
		this.data = data;
	}
	
	
}

public class ClassTest {
	
	public static void main(String[] args) {
		
		A a = new A(10);
		A b = new A();
		
		
		a.printData();
		b.printData();
		
	}
	

}
