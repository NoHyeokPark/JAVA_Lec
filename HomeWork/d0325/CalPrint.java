package HomeWork.d0325;

import java.util.Calendar;
import java.util.Date;

public abstract class CalPrint {
	private Calendar c = Calendar.getInstance();

	CalPrint() {

	}
	
	abstract void powerOn();
	
	public void setNow() {                  //변화한 날짜를 현재 날짜로 덮어씁니다.
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


	public void numPrint() {              // 1달 달력을 출력하는 메소드입니다.
		System.out.printf("------------------<< %d년 %d월 >>------------------\n", c.get(Calendar.YEAR),
				c.get(Calendar.MONTH) + 1);
		System.out.printf(" %2s\t%2s\t%2s\t%2s\t%2s\t%2s\t%2s\n", "일", "월", "화", "수", "목", "금", "토");
		System.out.println("---------------------------------------------------");
		int day = -c.get(Calendar.DAY_OF_WEEK) + c.get(Calendar.DATE) % 7;            //요일연산 현 요일 값을 받아와서 달의 1일까지 역산합니다.
		day = (day <= 0) ? day : day-7;
		for (int i = 0; i < c.getActualMaximum(Calendar.WEEK_OF_MONTH); i++) {
			System.out.print(" ");
			for (int j = 0; j < 7; j++) {                                            // 7번 숫자찍기를 그 달의 주 만큼 반복합니다
				++day;																// 1일부터 1씩 증가하며 찍고 0이하나 마지막날보다 클때는 공백을 찍습니다.
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
