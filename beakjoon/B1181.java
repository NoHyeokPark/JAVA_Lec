package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		Arrays.sort(s, (o1, o2) -> {
			if (o1.length() != o2.length())
				return o1.length() - o2.length();
			return o1.compareTo(o2);
		});
		for (int i = 0; i < n; i++) {
			if (i != 0 && s[i].equals(s[i - 1]))
				continue;
			bw.write(s[i]);
			bw.newLine();

		}
		bw.flush();
		bw.close();
		br.close();
	}
}
