package FreeStudy;

import java.util.Scanner;

public class B1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int max;
		int min = max = sc.nextInt();
		int Temp;

		for (int i = 0; i < m-1; i++) {
			if ((Temp = sc.nextInt()) < min)
				min = Temp;
			if (Temp > max)
				max = Temp;
		}
		
		System.out.println(min*max);
		sc.close();

	}
}
