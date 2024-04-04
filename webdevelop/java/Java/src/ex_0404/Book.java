package ex_0404;

public class Book {

	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title) {
		this.title = title;
	}

	public Book(String title, int page) {
		super();
		this.title = title;
		this.page = page;
	}

	public Book(int series, String title) {
		super();
		this.title = title;
		this.series = series;
	}
	
	public void bookInfo() {
		System.out.println("title : " + title);
		System.out.println("series : " + series);
		System.out.println("page : " + page);
		System.out.println("=====================");
	}
	
	
	
}
