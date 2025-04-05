package FreeStudy;

import java.util.Scanner;

public class B1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int six = 1000;
		int sixTemp;
		int single = 1000;
		int singleTemp;

		for (int i = 0; i < m; i++) {
			if ((sixTemp = sc.nextInt()) < six)
				six = sixTemp;
			if ((singleTemp = sc.nextInt()) < single)
				single = singleTemp;
		}
		if (single == 0) {
			System.out.println(0);
			System.exit(0);
		}
		if (six > single * 6) {
			System.out.println(single * n);
		} else {
			if (n % 6 > six / single) {
				System.out.println(n / 6 * six + six);
			} else {
				System.out.println(n / 6 * six + (n % 6) * single);
			}
		}

	}
}
