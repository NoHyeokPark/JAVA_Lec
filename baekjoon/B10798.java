package baekjoon;

import java.util.Scanner;

public class B10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int max = 0;
		String[] s = new String[n];
		
		
		for(int i = 0; i<n;i++ ) {
			s[i] = sc.nextLine();
			if(max < s[i].length()) 
				max = s[i].length();
		}
		
		for(int i = 0 ; i < max ; i++) {
			for(int j = 0; j < n; j++) {
				if(i<s[j].length())
				System.out.print(s[j].charAt(i));
			}
		}

	}
}
