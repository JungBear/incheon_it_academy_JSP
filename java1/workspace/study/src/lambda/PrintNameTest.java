package lambda;

public class PrintNameTest {
	public static void printFullName(PrintName name) {		
		System.out.println(name.getFullName("홍", "길동"));
	}
	
	public static void main(String[] args) {
		printFullName((firstName, lastName) -> firstName + " " + lastName);
		
	}

}
