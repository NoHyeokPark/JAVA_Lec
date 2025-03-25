package HomeWork.d0325;

import java.util.Scanner;

public class CalenderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("과제를 선택하세요 (1.과제1 2.과제2)");
		switch (sc.nextInt()) {
		case 1: {
			CalPrint cp = new HW0325_1();
			cp.powerOn();
			break;
		}
		case 2: {
			CalPrint cp = new HW0325_2();
			cp.powerOn();
			break;
		}
		default : System.out.println("잘못된 입력입니다");
		}
		sc.close();
	}

}
