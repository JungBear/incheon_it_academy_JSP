package accessTest2;

import accessTest1.Access1;

public class Access2 extends Access1{
	void test() {
		super.printData3();
		System.out.println("data3 ; " + super.data3);
	}
	
	public static void main(String[] args) {
		Access1 a1 = new Access1();
		
		System.out.println("data2 : " + a1.data2);
		System.out.println("data4 : " + a1.getData4());
		a1.setData4(50);
		System.out.println("===============");
		System.out.println("data4 : " + a1.getData4());
		System.out.println("===============");
		
		Access2 a2 = new Access2();
		a2.test();
		
		
	}
	
}
