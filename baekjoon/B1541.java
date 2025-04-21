package baekjoon;

import java.util.Scanner;

public class B1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] plus = s.split("-");
		int sum = 0;
		for(int i = 0; i < plus.length; i++) {
			String[] div = plus[i].split("\\+");
			int num = 0;
			for(int j = 0; j< div.length; j++) {
				num += Integer.parseInt(div[j]);
			}
			if (i == 0) {
				sum += num;
			} else {
				sum -= num;
			}
		}
		System.out.println(sum);
		
	}
}
