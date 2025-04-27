package beakjoon;

import java.util.Scanner;

public class B7789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int m = Integer.parseInt(s + n);
		double nn = Math.sqrt(n);
		double mm = Math.sqrt(m);
		boolean flag = false;
		for (int i = 2; i <= nn; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			for (int i = 2; i <= mm; i++) {
				if (m % i == 0) {
					flag = true;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}
}
