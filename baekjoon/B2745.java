package baekjoon;

import java.util.Scanner;

public class B2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int b = sc.nextInt();
		int ans = 0;
		
		for(int i = 0; i < s.length(); i++) {
			ans *= b;
			int s2 = s.charAt(i) - '0';
			if(s2 > 9) {
				s2 -= 7;
			}
			ans += s2;
		}
		
		System.out.println(ans);
	}
}
