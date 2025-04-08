package FreeStudy;

import java.util.Scanner;

public class B3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		System.out.println(dot(x) + " " + dot(y));
		

	}
	
	
	static int dot(int[] x) {
		if(x[0] == x[1]) {
			return x[2];
		} else if(x[0] == x[2]) {
			return x[1];
		} else {
			return x[0];
		}
	}
}
