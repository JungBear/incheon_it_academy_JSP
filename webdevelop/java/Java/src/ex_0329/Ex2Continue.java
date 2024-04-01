package ex_0329;

public class Ex2Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			for(int i = 1; i<= 2; i++) {
				for(int j = 1; j<= 5; j++) {
					if(j % 2 == 0) continue;
					System.out.print(j+ " ");
				}
				System.out.println();
			}
		
			int n = 0;
			while (n < 10) {
				n++;
				
				if(n % 2 != 0 ) continue;
				System.out.println(n);
			}
	}

}
