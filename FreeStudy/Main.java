package FreeStudy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 1;
			for (int j = 0; j < b; j++) {
				c = a * c % 10;
			}
			if (c == 0) {
				System.out.println(c+10);
			} else {
				System.out.println(c);
			}
		}
		sc.close();
	}

}
