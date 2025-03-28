package HomeWork.D0311;

import java.util.Scanner;

public class Day0311HW_AstarLine {

	public static void main(String[] args) {
		// 111111111111111111111111111111111111111111111

		Scanner sc = new Scanner(System.in);

		System.out.println("1번 도형의 라인을 입력하세요 :");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < line - i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		// 22222222222222222222222222222222222222222
		System.out.println("2번 도형의 라인을 입력하세요(홀수) :");
		int line2 = sc.nextInt();
		if (line2 % 2 == 0) {
			line2--;
		}
		for (int i = 0; i < line2; i++) {
			if (i <= line2 / 2) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < line2 - i; j++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}

		// 333333333333333333333333333333333333333333333333
		System.out.println("3번 도형의 라인을 입력하세요(홀수) :");
		int line3 = sc.nextInt();
		if (line3 % 2 == 0) {
			line3--;
		}
		for (int i = 0; i < line3; i++) {
			for (int j = 0; j < line3 / 2 + 1; j++) {
				if (i <= line3 / 2) {
					if (j < i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					if (j < line3 - 1 - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

		// 444444444444444444444444444444444444444444444444444444
		System.out.println("4번 도형의 라인을 입력하세요 :");
		int line4 = sc.nextInt();

		for (int i = 0; i < line4; i++) {
			for (int j = 0; j < 2 * line4 - 1; j++) {
				if (j < i) {
					System.out.print(" ");
				} else if (j < 2 * line4 - 1 - i) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
		sc.close();
	}

}
