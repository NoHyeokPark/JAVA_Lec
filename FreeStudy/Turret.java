package FreeStudy;

import java.util.Scanner;

public class Turret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			if (x1 == x2 && y1 == y2) {
				if (r1 == r2) {
					System.out.println("-1");
				}
				else {
					System.out.println("0");
				}

			} else {
				if (Math.sqrt(pita(x1, x2, y1, y2)) == r1 + r2 || Math.sqrt(pita(x1, x2, y1, y2)) == Math.abs(r1 - r2) ) {
					System.out.println("1");
				} else if (Math.sqrt(pita(x1, x2, y1, y2)) < r1 + r2 && Math.sqrt(pita(x1, x2, y1, y2)) > Math.abs(r1 - r2) ) {
					System.out.println("2");
				} else {
					System.out.println("0");
				}
			}
		}
		sc.close();
	}

	static int pita(int x1, int x2, int y1, int y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}

}
