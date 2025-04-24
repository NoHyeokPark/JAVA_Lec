package baekjoon;

import java.util.Scanner;

public class B25501 {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < n; i++) {
			int a = isPalindrome(sc.nextLine());
			System.out.printf(a + " " +cnt + "\n");
		}
	}

	static int isPalindrome(String s) {
		cnt = 0;
		return rec(s, 0, s.length() - 1);
	}

	static int rec(String s, int l, int r) {
		cnt++;
		if (l >= r) {
			return 1;
		} else if (s.charAt(l) != s.charAt(r)) {
			return 0;
		} else {
			return rec(s, l + 1, r - 1);
		}
	}
}
