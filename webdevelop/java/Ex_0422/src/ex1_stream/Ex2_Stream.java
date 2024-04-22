package ex1_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex2_Stream {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("홍길동", "이순신", "강감찬", "이범근", "손흥민"));
		System.out.println("list1 : " + list1);
		
		// Collectors : stream을 일반적인 List, Set등의 컬렉션으로 변경시키는 클래스
		// toCollection() : 좀 더 특정한 컬렉션으로 구현
		ArrayList<String> list1_1 = list1.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
		System.out.println("list1_1 : " + list1_1);
		
		// 배열
		String[] list2 = {"홍길동", "이순신", "강감찬", "이범근", "손흥민"};
		
		String[] list2_1 = Arrays.stream(list2).sorted().toArray(String[]::new);
		System.out.println("list2_1 : " + Arrays.deepToString(list2_1));
		
		Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int total = Arrays.stream(nums).reduce(0, (x,y) -> x + y );
		// 기본자료형으로 바꿔워야해서 오토 언박싱 발생
		System.out.println("1 ~ 10까지의 총합 : " + total);
		
		int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		IntStream stream2 = Arrays.stream(nums2);
		int total2 = stream2.reduce(0, (x,y) -> x + y );
		System.out.println("1 ~ 10까지의 총합 : " + total2);
		
		
	}

}
