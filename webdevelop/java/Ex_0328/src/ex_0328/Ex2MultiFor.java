package ex_0328;

public class Ex2MultiFor {
	public static void main(String[] args) {
		
//		1 2 3 4
//		1 2 3 4
//		1 2 3 4
		
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
		
		int num = 1;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
//		A B C D
//		A B C D
//		A B C D

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print((char)(65+j) + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
//		A B C D 
//		E F G H 
//		I J K L 
		char c ='A';
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(c++ + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		
	}

}
