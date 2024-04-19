package ex4_Stream;

import java.util.stream.IntStream;


public class Ex3_Stream {

	public static void main(String[] args) {
		
		
		int total = IntStream.rangeClosed(1, 10).sum();
		System.out.println(total);
		
	}

}
