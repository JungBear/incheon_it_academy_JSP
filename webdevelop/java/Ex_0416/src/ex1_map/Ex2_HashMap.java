package ex1_map;

import java.util.HashMap;

public class Ex2_HashMap {

	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("k1",100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		if(!map.isEmpty()) {
			System.out.println("맵은 비어있지 않습니다.");
		}
		
		if(map.containsKey("k3")) {
			System.out.println("k3라는 키가 존재합니다.");
		}
		
		if(map.containsValue(3.14f)) {
			System.out.println("3.14f라는 값이 존재합니다.");
		}

	}

}
