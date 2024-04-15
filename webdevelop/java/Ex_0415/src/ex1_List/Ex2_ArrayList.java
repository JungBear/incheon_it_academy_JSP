package ex1_List;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		System.out.println(list);
		list.add(1, 50);
		System.out.println(list);
		list.set(2, 100);
		System.out.println(list);
		list.add(55);
		System.out.println(list);
		//list.remove(1);
		//System.out.println(list);
		
		//list.clear();
		//list.removeAll(list);
		//System.out.println(list);
		
		if(list.contains(55)) {
			System.out.println("list에 55가 존재합니다.");
		}
	}

}
