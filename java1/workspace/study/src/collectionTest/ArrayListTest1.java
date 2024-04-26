package collectionTest;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		datas.add(10);
		datas.add(300);
		
		System.out.println(datas);
		
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
		}
	}

}
