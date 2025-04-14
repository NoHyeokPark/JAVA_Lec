package baekjoon;

import java.util.Scanner;

public class B2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		for(int i = 0 ; i < 5; i++) {
			
			if (b%5 == 0) {
				System.out.println(b/5+i);
				break;
			}
			if(b < 0 || i == 4) {
				System.out.println(-1);
				break;
			}
			b -= 3;
		}
	}
}
