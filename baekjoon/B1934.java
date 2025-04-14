package baekjoon;

import java.util.Scanner;

public class B1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a;
		int min = b;
		if (b>a) {
			max = b;
			min = a;
		}
		
		for(int j = 1 ;; j++) {
			if(max*j%min == 0) {
				System.out.println(max*j);
				break;
			}
		}
		}
		

	}
}
