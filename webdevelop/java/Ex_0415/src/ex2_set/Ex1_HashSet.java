package ex2_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Ex1_HashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("f");
		set.add("a");
		set.add("d");
		set.add("b");
		set.add("c");
		System.out.println(set);
		
		set.add("a");
		set.add("b");
		System.out.println(set);
		
		for (String s : set) {
			System.out.println(s);
		}
		
		set.remove("a");
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);
		
		// 1~45까지 난수를 6개 뽑아서 로또번호 생성 코드 작성
		HashSet<Integer> rotto = new HashSet<Integer>();
		Random rnd = new Random();
		
		while(rotto.size() < 6) {
			rotto.add(rnd.nextInt(45)+1);
		}
		
		System.out.println(rotto);
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,3,3,4,4,5,6,7,8,8,8,8));
		System.out.println(list);
		
		HashSet<Integer> hs1 = new HashSet<Integer>(list);
		System.out.println(hs1);
		
		ArrayList<Integer> result = new ArrayList<Integer>(hs1);
		System.out.println(result);
		
		
	}

}
