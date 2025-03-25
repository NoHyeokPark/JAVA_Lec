package HomeWork.d0325;

import java.util.Scanner;

public class HW0325_1 extends CalPrint {

	private Scanner sc = new Scanner(System.in);

	HW0325_1() {

	}

	public void yearPrint() {
		for (int i = 0; i < 12; i++) {
			setMonth(i + 1);
			numPrint();
		}
	}

	public void powerOn() {
		System.out.println("항목을 선택하세요(1.특정년도 2.특정월 3.종료)");
		switch (sc.nextInt()) {
		case 1: {
			inYear();
			yearPrint();
			break;
		}
		case 2: {
			inYear();
			inMonth();
			numPrint();
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

	public void inYear() {
		System.out.println("년도를 입력하세요");
		setYear(sc.nextInt());
	}

	public void inMonth() {
		System.out.println("월을 입력하세요");
		setMonth(sc.nextInt());
	}
}
