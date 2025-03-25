package HomeWork.d0325;

import java.util.Scanner;

public class HW0325_2 extends CalPrint {
	private Scanner sc = new Scanner(System.in);

	HW0325_2() {

	}
	
	public void changeMonth(int change) {
		int nextMonth = getMonth()+change;
		if(nextMonth < 0) {
			setYear(getYear()-1);
			nextMonth+=12;
		} else if (nextMonth > 11) {
			setYear(getYear()+1);
			nextMonth-=12;
		}
		setMonth(nextMonth+1);
	}
	
	public void powerOn() {
		System.out.println("항목을 선택하세요(1.현재 2.이전월 3.다음월 4.종료)");
		switch (sc.nextInt()) {
		case 1: {
			setNow();
			numPrint();
			break;
		}
		case 2: {
			changeMonth(-1);
			numPrint();
			break;
		}
		case 3: {
			changeMonth(1);
			numPrint();
			break;
		}
		case 4: {
			System.out.println("종료합니다.");
			return;
		}
		default:{
			System.out.println("잘못된 입력입니다.");
		}
	}
		powerOn();
	}
	
}
