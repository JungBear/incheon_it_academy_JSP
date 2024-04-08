package ex_0403;

public class ConTest {
	
	String name;

	
	public ConTest(){
		System.out.println("ConText의 생성자 호출");
	}

	public ConTest(String name){
		this.name = name;
	}
	
	public void printName() {
		System.out.println("name이 " + name + "으로 초기화 됨");
	}

}
