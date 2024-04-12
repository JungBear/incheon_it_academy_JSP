package ex4_calendar;

import java.util.Calendar;

public class Ex1_Calendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getWeekYear());
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH)+1;
		int day2 = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day2);
		
	}

}
