package beakjoon;

import java.util.Scanner;

public class B1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = n;
		for(int i = 1 ;; i++) {
			if(m<10) {
				m = m*11;
			} else {
				m = (m%10)*10+(m/10+(m%10))%10;
			}
			if(n == m) {
				System.out.println(i);
			break;
			}
		}

		sc.close();

	}
}
