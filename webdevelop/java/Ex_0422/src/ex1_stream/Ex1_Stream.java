package ex1_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_Stream {

	public static void main(String[] args) {
		Integer[] nums = {1, 44, 33, 21, 36 ,22, 3, 5, 1, 1, 2, 3, 2, 3, 14};
		
		Stream<Integer> stream = Arrays.stream(nums);
		
		// 중간연산
		stream.distinct()
			  .sorted()
			  .limit(5)
			  .forEach(System.out::println);
		
		// skip()
		// .rangeClosed() : 정수의 범위
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		// filter()
		IntStream intStream2 = IntStream.of(1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10);
		intStream2.distinct().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		// 문자열의 길이가 3이상인 문자열만 출력
		Stream.of("ab", "a", "abc", "abcd", "abcdef", "abcdefg").filter(x -> x.length() >= 3).forEach(x -> System.out.print(x + " "));
	
	}

}
