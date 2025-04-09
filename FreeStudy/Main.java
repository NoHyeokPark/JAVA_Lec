
package FreeStudy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 1;
		int cnt = 1;
		
		while(true) {
			if(a<=sum) {
				System.out.println(cnt);
				break;
			}
			sum += 6*cnt++;
		}

	}
}
