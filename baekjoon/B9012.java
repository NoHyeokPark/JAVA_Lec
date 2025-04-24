package baekjoon;

import java.util.Scanner;

public class B9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		num: for (int i = 0; i < n; i++) {
			int left = 0;
			int right = 0;
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				switch (s.charAt(j)) {
				case '(':
					left++;
					break;
				case ')':
					if (left > right) {
						right++;
					} else {
						System.out.println("NO");
						continue num;
					}
				}
			}
			if (left == right) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}
}
