package ex3_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex3_iterator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.print(val + " ");
		}
		
	}

}
