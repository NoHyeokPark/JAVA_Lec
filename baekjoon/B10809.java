package baekjoon;

import java.util.Scanner;

public class B10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=0; i<'z'-'a'+1;i++) {
		System.out.print(s.indexOf('a'+i) + " ");
		}
		
	}
}
