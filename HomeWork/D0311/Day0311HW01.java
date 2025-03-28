package HomeWork.D0311;

import java.util.Scanner;

public class Day0311HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int swab;
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d 번째 정수를 입력하세요 : ", i + 1);
			a[i] = sc.nextInt();
		}
		System.out.println("< PRINT >");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t", a[i]);
		}
		for (int i = 0; i < a.length; i++) { // 십의 자리와 일의 자리를 바꾸는 작업입니다
			swab = a[i] / 10 + a[i] % 10 * 10;
			a[i] = swab;
		}
		System.out.println("\n< REVERSE >");
		for (int i = 0; i < a.length; i++) { // 역순으로 출력합니다.
			System.out.printf("%d\t", a[a.length - i - 1]);
		}
		sc.close();
	}

}
