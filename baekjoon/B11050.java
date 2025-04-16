package baekjoon;

import java.util.Scanner;

public class B11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b == a || b == 0) {
			System.out.println(1);
		}else {
		System.out.println(fac(a)/fac(b)/fac(a-b));
		}
	}
	
	public static int fac(int n){
		for(int i = n-1 ; i > 0 ; i--) {
			n *= i;
		}
		return n;
	}
}
