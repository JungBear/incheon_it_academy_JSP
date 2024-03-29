package Ex_0329;

public class Ex1Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j%2 == 0) break;
				System.out.print(" " + j);
			}
			System.out.println();
		}
		
		int n = 1;
		while(true) {
			System.out.println(n);
			n++;
			if(n>5) break;
		}

	}

}
