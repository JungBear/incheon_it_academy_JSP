package ex_0403;

public class TimesTable {

	/**
	 * 
	 * @param 사용자가 입력한 값이며, 정수
	 * 
	 */
	public void showTable(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num , i, num * i);
		}
	}



}
