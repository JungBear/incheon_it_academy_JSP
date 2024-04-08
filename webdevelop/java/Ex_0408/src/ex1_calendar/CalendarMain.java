package ex1_calendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.oneTheDest();
		System.out.println("======================");
		
		Calendar c = new DeskCalendar("연두색", 3);
		c.info();
		c.hanging();
		
	}

}
