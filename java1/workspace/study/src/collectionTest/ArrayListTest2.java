package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		datas.add(100);
		datas.add(300);
		datas.add(400);
		datas.add(200);
		datas.add(500);
		datas.add(600);
		datas.add(800);
		datas.add(700);
		
		System.out.println(datas);
		Collections.sort(datas);
		System.out.println(datas);
		
		Collections.reverse(datas);
		System.out.println(datas);
		
//		Collections.shuffle(datas);
//		System.out.println(datas);
		
		datas.add(0, 1000);
		System.out.println(datas);
		
		System.out.println(datas.contains(200));
		
		// 간단 실습
		// 400 뒤에 4000을 삽입
		if(datas.contains(400)) {
			int idxOf400 = datas.indexOf(400);
			datas.add(idxOf400+1, 4000);
		}
		
		System.out.println(datas);
		
		System.out.println("======================================================");
		
		datas.set(datas.indexOf(4000), 40);
		System.out.println(datas);
		
		System.out.println("======================================================");
		
		System.out.println(datas.remove(0) + "을 삭제");
		System.out.println(datas);
		
		datas.remove((Integer)40);
		System.out.println(datas);
	}

}
