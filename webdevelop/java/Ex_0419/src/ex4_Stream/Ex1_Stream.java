package ex4_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex1_Stream {

	public static void main(String[] args) {
		String[] strArray = {"홍길동", "제임스", "완승"};
		
		
		// 배열로 스트림 객체 생성
		// Arrays클래스 -> static stream()
		// stream.of(T[] t)
		// stream.of(T... values)
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(x -> {x += "1";
			System.out.println(x);});
		
		System.out.println(Arrays.toString(strArray));
		
		Stream<String> strStream2 = Stream.of("a", "b", "c");
		

	}

}
