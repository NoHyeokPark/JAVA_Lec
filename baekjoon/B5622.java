package baekjoon;

import java.util.Scanner;

public class B5622 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) - 'A';
			if (num == 18 || num == 21 || num > 23) {
				sum--;
			}
			sum += (num / 3) + 3;
		}
		System.out.println(sum);

	}
}
