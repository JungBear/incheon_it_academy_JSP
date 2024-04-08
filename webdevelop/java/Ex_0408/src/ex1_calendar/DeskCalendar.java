package ex1_calendar;

public class DeskCalendar extends Calendar{

	
	
	public DeskCalendar(String color, int month) {
		super(color, month);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void hanging() {
		// TODO Auto-generated method stub
		System.out.println(color + "달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	public void oneTheDest() {
		System.out.println(color + "달력을 책상에 세울수 있습니다.");
	}
	
	
}
