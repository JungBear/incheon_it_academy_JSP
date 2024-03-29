package Ex_0329;

public class Ex3Label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		h:for(int i = 1; i<= 3; i++) {
			for (int j = 1; j <=10; j++) {
				System.out.print(j + " ");
			}
			
			for(int k = 1; k <= 10; k++) {
				if(k % 2 == 0) break h;
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		int n = 0;
		
		a:while(true) {
			if(n >= 10) break;
			while(true) {
				n++;
				if(n % 3 ==0) {
					System.out.println("continue를 만남");
					continue a;
				}
				System.out.println(n);
			}
		}
		System.out.println("----------------------");
		
		n = 0;
		w:while(n<10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch문 1번 거쳐감");
				break w;
			case 2:
				System.out.println("switch문 2번 거쳐감");
				continue;
			}
			System.out.println(n);
		}
	}

}
