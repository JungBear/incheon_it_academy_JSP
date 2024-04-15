package accessTest1;

public class Access3 {
	public static void main(String[] args) {
		Access1 a1 = new Access1();
		
		System.out.println("data1 : " + a1.data1);
		System.out.println("data2 : " + a1.data2);
		System.out.println("data3 : " + a1.data3);
		
		System.out.println("data4 : " + a1.getData4());
		a1.setData4(50);
		System.out.println("===================");
		System.out.println("data4 : " + a1.getData4());
		
		
	}


}
