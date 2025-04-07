package FreeStudy;

import java.util.Scanner;

public class B1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String xs = Integer.toBinaryString(x);
		int cnt = 0;
		for (int i = 0; i < xs.length(); i++) {
			if (xs.charAt(i) == '1')
				cnt++;
		}
		System.out.println(cnt);

	}
}
