package FreeStudy;

import java.util.Scanner;

public class LittlePrincess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int k;
		for(int j=0; j<t; j++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int n = sc.nextInt();
			k=0;
		for (int i = 0; i < n; i++) {
			int cx = sc.nextInt();
			int cy = sc.nextInt();
			int cr = sc.nextInt();
			if((x1-cx)*(x1-cx)+(y1-cy)*(y1-cy)<cr*cr != (x2-cx)*(x2-cx)+(y2-cy)*(y2-cy)<cr*cr) {
				k++;
			}
		}
		System.out.println(k);
		}
		sc.close();
	}

}
