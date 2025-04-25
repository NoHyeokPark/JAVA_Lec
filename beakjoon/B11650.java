package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] a = s.split(" ");
			arr[i][0] = Integer.parseInt(a[0]);
			arr[i][1] = Integer.parseInt(a[1]);
		}
		Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] != o2[0]) return o1[0] - o2[0];
            return o1[1] - o2[1];
        });
		for (int i = 0; i < n; i++) {
			bw.write(String.valueOf(arr[i][0]));
			bw.write(" ");
			bw.write(String.valueOf(arr[i][1]));
			bw.newLine();
		}
		bw.flush();
        bw.close();
        br.close();
	}
}
