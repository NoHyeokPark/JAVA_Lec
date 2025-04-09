package baekjoon;

import java.util.Scanner;

public class B2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		for(int i = 0 ; i < n; i++) {
			x *= 2;
		}
		System.out.println((x+1)*(x+1));
		
	}
}
