package baekjoon;

import java.util.Scanner;

public class B27433 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		for(int i = n; i > 1; i--) {
			ans*=i;
		}
		System.out.println(ans);
		
	}
}
