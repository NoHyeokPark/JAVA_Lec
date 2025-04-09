package baekjoon;

import java.util.Scanner;

public class B10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i<m; i++) {
			int id1 = sc.nextInt();
			int id2 = sc.nextInt();
			for(int j = 0; j < (id2-id1+1)/2; j++){
				int temp = arr[id1-1+j];
			arr[id1-1+j] = arr[id2-1-j];
			arr[id2-1-j] = temp;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
