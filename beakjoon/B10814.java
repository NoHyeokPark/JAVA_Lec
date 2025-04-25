package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[][] s = new String[n][3];
		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			String[] b = a.split(" ");
			s[i][0] = b[0];
			s[i][1] = b[1];
			s[i][2] = Integer.toString(i);
		}
		Arrays.sort(s, (o1, o2) -> {
			if (o1[0] != o2[0])
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
		});
		for (int i = 0; i < n; i++) {
			bw.write(s[i][0] + " " + s[i][1]);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
