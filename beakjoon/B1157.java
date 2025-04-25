package beakjoon;

import java.util.Scanner;

public class B1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int max = -1;
		int idx = 0;
		boolean flag = false;
		for (int i = 0; i < 26; i++) {
			int temp = countString('A'+i, s);
			if (max < temp) {
				max = temp;
				idx = i;
				flag = false;
			} else if (max == temp) {
				flag = true;
			}
		}
		System.out.println(flag ? "?" : (char) (idx + 'A'));

		sc.close();

	}
	
	static int countString(int a, String s) {
		int cnt = 0;
		int sub = 0;
		while((sub = s.indexOf(a, sub)) != -1) {
			cnt++;
			sub++;
		}
		sub = 0;
		a += 'a'-'A';
		while((sub = s.indexOf(a, sub)) != -1) {
			cnt++;
			sub++;
		}
		return cnt;
	}

}
