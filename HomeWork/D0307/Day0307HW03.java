package HomeWork.D0307;

import java.util.Scanner;

public class Day0307HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요(첫번째)");
		int a = sc.nextInt();
		System.out.printf("정수를 입력하세요(두번째)");
		int b = sc.nextInt();
		System.out.printf("정수를 입력하세요(세번째)");
		int c = sc.nextInt();
		// ↑여기까지 입력부
		if (a >= b) {
			if (a >= c) {
				System.out.printf("%d %d %d", a, (b > c) ? b : c, (b > c) ? c : b); // a 가 가장 클때
			} else {
				System.out.printf("%d %d %d", c, a, b);
			}

		} else {
			if (b >= c) {
				System.out.printf("%d %d %d", b, (a > c) ? a : c, (a > c) ? c : a); // b 가 가장 클때
			} else {
				System.out.printf("%d %d %d", c, b, a);
			}
		}
		// 여기까지 출력부
		sc.close();
	}

}
