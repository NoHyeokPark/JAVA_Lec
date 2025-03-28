package work.test1;

import java.util.Calendar;

public class ttts {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘은 " + year + "년 " + month + "월 "
				+ date + "일");
		System.out.println(c.getActualMaximum(Calendar.DATE));
		c.set(Calendar.DATE, 31);
		c.set(Calendar.MONTH, 3);
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
        
	}

}
