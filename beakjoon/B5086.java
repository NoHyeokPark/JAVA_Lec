package beakjoon;

import java.util.Scanner;

public class B5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int m = 1;
		while (n + m != 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n * m != 0) {
				if (n % m == 0) {
					System.out.println("multiple");
					continue;
				} else if (m % n == 0) {
					System.out.println("factor");
					continue;
				}
			} else if (n + m == 0) {
				break;
			}
			System.out.println("neither");
		}
		sc.close();

	}
}
