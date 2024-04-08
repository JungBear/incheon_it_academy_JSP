package ex_0405;

class Parents{int a =2;}

class Child extends Parents{int b = 1;}

public class Ex1_class_casting {
	

	public static void main(String[] args) {
		Parents p1 = new Parents();
		Child c1 = new Child();
		
		Parents p2 = new Child();
		Parents p3 = c1;
		
		c1.a++;
		System.out.println(c1.a);
		System.out.println(p3.a);
		
		

	}

}
