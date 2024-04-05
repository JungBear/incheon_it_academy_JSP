package ex_0405;

public class Book {
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public final void infoTitle() {
		System.out.println("책의 제목은 " + title + "입니다.");
	}
	
	public void infoAuthor() {
		System.out.println("책의 저자는 " + author + "입니다.");
	}
	
	public String getAuthor() {
		return author;
	}

}
