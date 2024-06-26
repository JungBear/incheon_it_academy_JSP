package ex2_enum;

import java.util.Arrays;

public class Ex1_enum {

	public static void main(String[] args) {
		Item[] items = Item.values();
		
		System.out.println(Arrays.toString(items));
		
		for(Item item : items) {
			System.out.println("name = " + item.name() + ", ordinal = " + item.ordinal());
		}
		
		Item i1 = Item.START;
		System.out.println(i1.toString());
		
		Item i2 = Item.valueOf("START");
		System.out.println(i2);
		
		Item i3 = Item.valueOf(Item.class, "START");
		//.class : 클래스 리터럴
		// 클래스 자체의 정보를 얻을 수 있다
		System.out.println(i3);
		
		Item i4 = Item.STOP;
		System.out.println(i4);
		
		// 열거형 상수끼리의 비교
		// == ( 상수의 주소를 비교)
		// 이외의 
		
		System.out.println(i1 == i2);
		System.out.println(i1 == i4);
		
		System.out.println(i1.compareTo(i4));
		System.out.println(i4.compareTo(i1));
		
		switch(i1) {
		case START:
			System.out.println("게임 시작");
			break;
		case STOP:
			System.out.println("게임 멈춤");
			break;
		case EXIT:
			System.out.println("게임 종료");
		}
		
		
	}

}
