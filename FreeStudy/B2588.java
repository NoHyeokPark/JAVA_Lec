package FreeStudy;

import java.util.Scanner;

public class B2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); sc.nextLine();
		String y = sc.nextLine();
		int sum = 0;
		int mul = 1;
		
		for(int i=1; i<=y.length();i++) {
			int temp = (y.charAt(y.length()-i) - '0');
			mul *= 10;
			System.out.println(temp * x);
			sum += temp * x * mul/10;
		}
		System.out.println(sum);
		
	}
}
