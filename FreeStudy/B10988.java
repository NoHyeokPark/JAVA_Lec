package FreeStudy;

import java.util.Scanner;

public class B10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		for (int i = 0; i < (n.length() + 1) / 2; i++) {
			if(n.charAt(i) == n.charAt(n.length()-1-i)) {
				
			} else {
				System.out.println(0);
				System.exit(0);
			}
		}
		System.out.println(1);

	}
}
