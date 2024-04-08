package ex_0405;

public class BookMain {

	public static void main(String[] args) {
		Comic comicbook = new Comic("원피스", "오다", false);
		
		comicbook.infoTitle();
		comicbook.infoAuthor();
		comicbook.infoColor();

	}

}
