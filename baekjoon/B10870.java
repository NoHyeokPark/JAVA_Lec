package baekjoon;

import java.util.Scanner;

public class B10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(pibo(n));
	}

	static int pibo(int a) {
		if (a == 1) {
			return 1;
		}
		if (a == 0) {
			return 0;
		}
		return pibo(a - 1) + pibo(a - 2);
	}
}
