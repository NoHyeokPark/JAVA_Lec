package HomeWork.d0325;

import java.util.Calendar;
import java.util.Date;

public abstract class CalPrint {
	private Calendar c = Calendar.getInstance();

	CalPrint() {

	}
	
	abstract void powerOn();
	
	public void setNow() {
		c.setTime(new Date());
	}
	
	public int getYear() {
		return c.get(Calendar.YEAR);
	}
	
	public int getMonth() {
		return c.get(Calendar.MONTH);
	}
	
	public void setYear(int year) {
		c.set(Calendar.YEAR, year);
	}
	
	public void setMonth(int month) {
		c.set(Calendar.MONTH, month-1);
	}


	public void numPrint() {
		System.out.printf("------------------<< %d년 %d월 >>------------------\n", c.get(Calendar.YEAR),
				c.get(Calendar.MONTH) + 1);
		System.out.printf(" %2s\t%2s\t%2s\t%2s\t%2s\t%2s\t%2s\n", "일", "월", "화", "수", "목", "금", "토");
		System.out.println("---------------------------------------------------");
		int day = -c.get(Calendar.DAY_OF_WEEK) + c.get(Calendar.DATE) % 7;
		day = (day <= 0) ? day : day-7;
		for (int i = 0; i < c.getActualMaximum(Calendar.WEEK_OF_MONTH); i++) {
			System.out.print(" ");
			for (int j = 0; j < 7; j++) {
				++day;
				if (day > 0 && day <= c.getActualMaximum(Calendar.DATE)) {
					System.out.printf("%2d\t", day);
				} else {
					System.out.printf("  \t", day);
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------");
		System.out.println();
	}
}
