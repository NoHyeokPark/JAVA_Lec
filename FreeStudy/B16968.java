package FreeStudy;

import java.util.Scanner;

public class B16968 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ans = 1;
		int mul;
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) == 'c') {
				mul = 26;
			} else {
				mul = 10;
			}
			
			if(i != 0 && s.charAt(i) == s.charAt(i-1)) {
				mul -= 1;
			}
			ans *= mul;
		}
		System.out.println(ans);
}
}
