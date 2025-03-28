package HomeWork.D0307;

import java.util.Scanner;

public class Day0307HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요(첫번째)");
		int a = sc.nextInt();
		System.out.printf("정수를 입력하세요(두번째)");
		int b = sc.nextInt();
		System.out.printf("정수를 입력하세요(세번째)");
		int c = sc.nextInt();
		System.out.printf("정수를 입력하세요(네번째)");
		int d = sc.nextInt(); // 입력을 받습니다

		int max = (a >= b) ? a : b; // 큰 수만 저장합니다
		max = (max >= c) ? max : c;
		max = (max >= d) ? max : d;
		System.out.println("가장 큰 수 : " + max);
		sc.close();

	}

}
