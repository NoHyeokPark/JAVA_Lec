package HomeWork.D0311;

import java.util.Scanner;

public class Day0311HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length;) {
			System.out.printf("%d 번째 정수를 입력하세요 : ", i + 1);
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				i++;
			}
		}
		System.out.println("< PRINT >");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		sc.close();
	}

}
