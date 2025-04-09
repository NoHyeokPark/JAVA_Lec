package baekjoon;

import java.util.Scanner;

public class B2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i ++) {
			int m = sc.nextInt();
			String s = sc.next();
			char[] arr = new char[s.length()*m];
			int cnt = 0;
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < m; k++) {
					arr[cnt++] = s.charAt(j);
				}
			}
			String p = new String(arr);
			System.out.println(p);
		}
		
	}
}
