package baekjoon;

import java.util.Scanner;

public class B2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int even = 1;
		int odd = 1;

		for (int i = 2; i <= a || i <= b;) {
			int aa = a % i;
			int bb = b % i;
			if (aa != 0 && bb != 0) {
				i++;
			} else if (aa + bb == 0) {
				even *= i;
				a /= i;
				b /= i;
			} else {
				if (aa == 0 && a > 0) {
					odd *= i;
					a /= i;
				}
				if (bb == 0 && b > 0) {
					odd *= i;
					b /= i;
				}
			}

		}
		System.out.println(even);
		System.out.println(odd * even);

	}
}
