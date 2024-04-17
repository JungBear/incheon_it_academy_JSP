package ex1_lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex1_function {

	public static void main(String[] args) {
		// 정적 메서드 참조
		Function<String, Integer> f = Integer::parseInt;
		int n = f.apply("100");
		System.out.println("n : " + n);
		
		//매개변수의 메서드 참조
		//BiFunction<String, String, Boolean> f2 = (s1, s2) -> s1.equals(s2);
		BiFunction<String, String, Boolean> f2 = String::equals;
		boolean result = f2.apply("홍길동", "홍길동");
		System.out.println("f2 : " + result);
		
		//인스턴스 메서드 참조
		ArrayList<Integer> list = new ArrayList<Integer>();
		Consumer<Collection<Integer>> addElements;
		//addElements = (arr) -> list.addAll(arr);
		addElements = list::addAll;
		
		addElements.accept(List.of(1,2,3,4,5));
		System.out.println(list);

	}

}
