package ex_0405;

public class Comic extends Book{
	
	boolean isColor;

	public Comic(String title, String author, boolean isColor) {
		super(title, author);
		this.isColor = isColor;
	}
	
	@Override
	public void infoAuthor() {
		System.out.println("이 만화책의 저자는 " + super.getAuthor() + "입니다");
	}


	public void infoColor() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		}else {
			System.out.println("이 만화책은 흑백입니다.");			
		}
	}
	
	
}
