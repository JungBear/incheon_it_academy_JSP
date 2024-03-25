package ex1_casting;

public class Ex2_Demotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str1 = "12";
			int i1 = 0;
			
			i1 = Integer.parseInt(str1);
			System.out.println("i1 : " + i1);
			int i2 = 126;
			str1 = Integer.toString(i2);
			System.out.println("i2 : " +i2 );
			
			double d2 = 2.5;
			String str2 = Double.toString(d2);
			System.out.println("str2 : " + str2);
			
	}

}
