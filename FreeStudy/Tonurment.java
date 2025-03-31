package FreeStudy;

import java.util.Scanner;

public class Tonurment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kim = sc.nextInt();
		int im = sc.nextInt();
        sc.close();
		int a = 1;
		int i = 0;
		while (a < n) {
			a <<= 1;
			i++;
		}
		while (true) {
			a >>= 1;
			if ((kim > a && im <= a) || (kim <= a && im > a)) {
				System.out.println(i);
				break;
			}
			if (kim>a) {
				kim -= a;
				im -= a;
			}
			i--;
			
		}

	}

}
