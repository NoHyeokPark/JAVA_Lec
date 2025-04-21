package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n+m];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]);
		}
		
	}

}
