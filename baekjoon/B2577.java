package baekjoon;

import java.util.Scanner;

public class B2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		a *= sc.nextInt();
		a *= sc.nextInt();
		int b = (int) (Math.log10(a) + 1);
		int[] arr = new int[10];
		for (int i = 0; i < b; i++) {
			arr[a % 10] += 1;
			a /= 10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
