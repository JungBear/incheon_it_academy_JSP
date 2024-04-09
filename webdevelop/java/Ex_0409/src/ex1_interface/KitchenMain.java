package ex1_interface;

public class KitchenMain {

	public static void main(String[] args) {
		
		Kitchen k = new Kitchen();
		
		Menu1 im1 = k;
		Menu2 im2 = k;
		Menu3 im3 = k;
		
		System.out.println("볶음밥 : " + k.boggembab());
		System.out.println("자장면 : " + k.jajang());
		System.out.println("탕수육 : " + k.tangsuyuck());
		System.out.println("========================");
		
		System.out.println(im1.jajang());
		System.out.println(im1.tangsuyuck());
		System.out.println(im1.boggembab());
		System.out.println("========================");
		
		System.out.println(im2.boggembab());
		System.out.println(im3.tangsuyuck());
		
	}

}
