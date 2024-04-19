package ex4_Stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;


public class Ex2_Stream {

	public static void main(String[] args) {
		// 컬렉션 스트림
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("박길동");
		
		Stream<String> setStream = set.stream();
		setStream.forEach(System.out::println);
		
		ArrayList<String> list = new ArrayList<String>(set);
		Stream<String> listStream = list.stream();
		

	}

}
