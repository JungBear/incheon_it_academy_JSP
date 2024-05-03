package hashMapTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTask {

	public static void main(String[] args) {
		/*
		 * 카페 메뉴
		 * 아메리카노 2500
		 * 라떼 3500
		 * 모카 4500
		 * 바닐라 라떼 4500
		 * 
		 * 출력과 입력
		 * 1. 아메리카노
		 * 2. 라떼
		 * 3. 모카
		 * 4. 바닐라 라떼
		 * 
		 * 입력 >> 2
		 * 라떼는 3500원 입니다
		 */
		
		HashMap<String, Integer> cafeMenu = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String result;
		cafeMenu.put("아메리카노", 2500);
		cafeMenu.put("라떼", 3500);
		cafeMenu.put("모카", 4500);
		cafeMenu.put("바닐라 라떼", 4500);
		
		System.out.println("1. 아메리카노");
		System.out.println("2. 라떼");
		System.out.println("3. 모카");
		System.out.println("4. 바닐라 라떼");
		System.out.print("입력 >> ");
		String str = null;
		
		try {
			
			str = br.readLine();
			int inputNum = Integer.parseInt(str);
			
			switch (inputNum) {
			case 1:
				result = "아메리카노는 " +  cafeMenu.get("아메리카노") + " 입니다";
				break;
			case 2:
				result = "라떼는 " +  cafeMenu.get("라떼") + " 입니다";
				break;
			case 3:
				result = "모카는 " +  cafeMenu.get("모카") + " 입니다";
				break;
			case 4:
				result = "바닐라 라떼는 " +  cafeMenu.get("바닐라 라떼") + " 입니다";
				break;
			default:
				result = "없는 메뉴입니다";
				break;
			}
			System.out.println(result);
			
		} catch (IOException e) {
			
		} catch (Exception e) {
			System.out.println("잘못입력하셨습니다");
		}finally {
			try {
				if(str != null) {
					br.close();
				}
			} catch (Exception err) {
			}
		}

	}

}
