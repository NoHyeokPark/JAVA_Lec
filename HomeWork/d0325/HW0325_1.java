package HomeWork.d0325;

import java.util.Scanner;

public class HW0325_1 extends CalPrint {                // 1번과제 입니다

	private Scanner sc = new Scanner(System.in);

	HW0325_1() {

	}

	private void yearPrint() {                    //1달 달력을 출력하는 메소드를 12번 반복합니다
		for (int i = 0; i < 12; i++) {
			setMonth(i + 1);
			numPrint();
		}
	}
	@Override
	public void powerOn() {
		System.out.println("항목을 선택하세요(1.특정년도 2.특정월 3.종료)");
		switch (sc.nextInt()) {
		case 1: {
			inYear();     						 //입력을 받아서 년도를 바꾸는 메소드입니다.
			yearPrint();
			break;
		}
		case 2: {
			inYear();
			inMonth();    						 //입력을 받아서 월을 바꾸는 메소드입니다.
			numPrint();   						 // 1달 달력을 출력합니다.
			break;
		}
		case 3: {
			System.out.println("종료합니다.");
			return;
		}
		default:
			System.out.println("잘못된 입력입니다.");
		}
		powerOn();
	}

	private void inYear() { 						//입력을 받아서 년도를 바꾸는 메소드입니다.
		System.out.println("년도를 입력하세요");
		setYear(sc.nextInt());
	}

	private void inMonth() {						//입력을 받아서 개월을 바꾸는 메소드입니다.
		System.out.println("월을 입력하세요");
		setMonth(sc.nextInt());
	}
}
