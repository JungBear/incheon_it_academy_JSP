package ex1_calendar;

public class Calendar {
	
	String color;
	int month;
	
	
	public Calendar(String color, int month) {
		this.color = color;
		this.month = month;
	}
	
	public void info() {
		System.out.println(color + "달력은 " + month + "월까지 있습니다.");
	}
	
	public void hanging() {
		System.out.println(color + "달력을 벽에 걸 수 있습니다.");
	}

	
}
