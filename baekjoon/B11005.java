package baekjoon;

import java.util.Scanner;

public class B11005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int a = 1;
		int temp;
		while(n/b>=a) {
			a *= b;
		}
		while(true) {
			temp = 0;
			if(a==0) break;
			if(n>=a) {
				temp = n/a;
				n %= a;
				if(temp>9) {
					temp += 7;
				}
			}
			System.out.print((char)(temp+'0'));
			a /= b;
		}
		

	}
}
