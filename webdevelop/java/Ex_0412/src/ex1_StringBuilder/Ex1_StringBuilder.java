package ex1_StringBuilder;

public class Ex1_StringBuilder {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hello");
		
		str.append(" world");
		System.out.println(str);
		
		str.delete(2, 5);
		System.out.println(str);

		str.insert(2, "llo");
		System.out.println(str);

		str.replace(2, 5, "ooaasd");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
	}

}
