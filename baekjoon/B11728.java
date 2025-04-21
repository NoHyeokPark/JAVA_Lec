package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B11728 {
	public static void main(String[] args) {
		try {
			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[n + 1];
		int[] arr2 = new int[m + 1];
		int idx1 = 0;
		int idx2 = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		arr1[n] = 1000000000;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		arr2[m] = 1000000000;
		for (int i = 0; i < n + m; i++) {
			if (arr1[idx1] < arr2[idx2]) {
				bw.write(arr1[idx1++] + " ");
			} else {
				bw.write(arr2[idx2++] + " ");
			}
		}
		 bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
