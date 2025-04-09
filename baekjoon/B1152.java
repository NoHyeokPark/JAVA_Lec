package baekjoon;

import java.util.Scanner;

public class B1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < n.length()-1; i++) {
			if(n.charAt(i) == ' ') {
				sum++;
			}
		}
		if(n.charAt(0) != ' ') {
			sum++;
		}
		System.out.println(sum);
		
	}
}
