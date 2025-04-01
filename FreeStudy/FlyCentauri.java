package FreeStudy;

import java.util.Scanner;

public class FlyCentauri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			x = sc.nextInt() - x;
			for (int j = 2;; j+=2) {
				if (x <= j) {
					if (2*x <= j) {
						System.out.println(j - 1);
						break;
					} else {
						System.out.println(j);
						break;
					}
				}
				x -= j;

			}

		}
		sc.close();

	}

}
