package baekjoon;

import java.util.Scanner;

public class B2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int b = 1 << n;
		int max = -1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum <= m && max < sum) {
						max = sum;
					}
				}
			}
		}

		System.out.println(max);

	}
}
