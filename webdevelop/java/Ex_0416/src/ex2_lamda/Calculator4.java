package ex2_lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Calculator4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5");
		
		Consumer<String> con = t -> System.out.println(t);
		list.forEach(con);
		System.out.println("========");
		
		list.forEach(x -> System.out.println(x));
		System.out.println("========");
		
		list.forEach(System.out::println);
	}

}
