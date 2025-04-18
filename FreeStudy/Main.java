
package FreeStudy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int[] a = new int[4];
		long ans = 1;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A' -> a[0]++;
			case 'C' -> a[1]++;
			case 'G' -> a[2]++;
			case 'T' -> a[3]++;
			}
			;
		}
		for (int x : a) {
			ans *= x;
			ans %= 1000000007;
		}
		System.out.println(ans);

	}
}
