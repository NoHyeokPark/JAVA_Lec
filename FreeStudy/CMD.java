package FreeStudy;

import java.util.Scanner;

public class CMD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		char[] ans = s[0].toCharArray();
		for (int j = 0; j < s[0].length(); j++) {
			for (int i = 0; i < n-1; i++) {
				if (s[i].charAt(j) != s[i + 1].charAt(j)) {
					ans[j] = '?';
					break;
				}
			}
		}
		System.out.println(new String(ans));
		sc.close();
	}

}
