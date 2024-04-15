package ex1_List;

import java.util.ArrayList;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(100);
		list.add(100);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		int res = list.get(2);
		System.out.println(res);
		
		for (int ele : list) {
			System.out.println(ele);
		}
		
		list.forEach(x->System.out.println(x + " "));
	}

}
