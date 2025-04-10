package baekjoon;

import java.util.Scanner;

public class B1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			if (b > max) {
				max = b;
			}
			sum += b;
		}
		System.out.println((double)sum/max*100/n);

	}
}
