package baekjoon;

import java.util.Scanner;

public class B2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		n = (n%10)*100 + (n/10%10)*10 + n/100;
		m = (m%10)*100 + (m/10%10)*10 + m/100;
		if(n>m) {
			System.out.println(n);
		} else {
			System.out.println(m);
		}
		
		
	}
}
