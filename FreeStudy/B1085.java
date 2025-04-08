package FreeStudy;

import java.util.Scanner;

public class B1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int xs = sc.nextInt();
		int ys = sc.nextInt();
		
		x = min(x, xs-x);
		y = min(y, ys-y);
		System.out.println(min(x,y));
	}

	static int min(int a, int b) {
		if (a >= b) {
			return b;
		}
		return a;
	}
}
