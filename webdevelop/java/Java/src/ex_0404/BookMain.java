package ex_0404;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book();
		b1.bookInfo();
		
		Book b2 = new Book("멘토시리즈 자바");
		b2.bookInfo();
		
		Book b3 = new Book("신데렐라", 180);
		b3.bookInfo();
		
		Book b4 = new Book(3, "해리포터");
		b4.bookInfo();
		
	}

}
