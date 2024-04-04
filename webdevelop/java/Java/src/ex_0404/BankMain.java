package ex_0404;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new Bank("부평", "032-232-2222");
		Bank b2 = new Bank("강남", "02-123-1234");
		Bank b3 = new Bank("대전", "042-042-0423");
		
		Bank.interest = 1f;
		
		b1.printBank();
		b2.printBank();
		b3.printBank();
		
		
	}

}
