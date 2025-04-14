package baekjoon;

import java.util.Scanner;

public class B1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			for (int j = 2; j <= a; j++) {
				if (a % j == 0) {
					if(j == a) {
						cnt++;
					} else {
					break;
					}
				} 
			}
		}
		System.out.println(cnt);

	}
}
