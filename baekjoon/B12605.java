package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B12605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String a = sc.nextLine();
			String[] arr = a.split(" ");
			Stack<String> ss = new Stack<>();
			for (int j = 0; j < arr.length; j++) {
				ss.push(arr[j]);
			}
			System.out.printf("Case #%d: ", i+1);
			for (int j = 0; j < arr.length; j++) {
				System.out.print(ss.pop()+" ");
				
			}
			System.out.println();
		}

	}
}
