package ex_0404;

public class Bank {
	
	String name = "우리은행";
	String point;
	String tel;
	static float interest = 10f;
	
	
	public Bank( String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	public void printBank() {
		System.out.println("이름 : " + name);
		System.out.println("위치 : " + point);
		System.out.println("번호 : " + tel);
		System.out.println("이율 : " + interest + "%");
		System.out.println("===========================");
	}
	
	
}
