package ex1_List;

import java.util.ArrayList;

public class Ex3_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<Integer> ageList = new ArrayList<Integer>();
		
		nameList.add("제임스");
		ageList.add(20);
		
		nameList.add("스미스");
		ageList.add(30);
		
		nameList.add("심슨");
		ageList.add(40);
		
		nameList.add("기영이");
		ageList.add(50);
		
		System.out.println("======================");
		
		ArrayList<Person> pList = new ArrayList<Person>();
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("이순신", 20);
		pList.add(p1);
		pList.add(p2);

		for (Person p : pList) {
			System.out.println(p.name);
			System.out.println(p.age);
		}
	
		

	}

}
