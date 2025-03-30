package FreeStudy;

import java.util.Scanner;

public class Bridge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(bridge(n, m));
		}
		sc.close();

	}

	private static int bridge(int n, int m) {
		if (n == 1) {
			return m;
		} else if (n == 2) {
			int a = m - n + 1;
			return a * (a + 1) / 2;
		} else {
			int a = 0;
			for (int i = 0; i < m - n + 1; i++) {
				a += bridge(n - 1, m - i - 1);
			}
			return a;
		}
	}

}
