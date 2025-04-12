package FreeStudy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class B1059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			arr.add(sc.nextInt());
		}
		int n = sc.nextInt();
		arr.sort(Comparator.naturalOrder());
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == n) {
				System.out.println(0);
				break;
			}
			if (arr.get(i) > n) {
				if (i != 0) {
					System.out.println((n - arr.get(i - 1)) * (arr.get(i) - n) - 1);
				} else {
					System.out.println(n * (arr.get(i) - n) - 1);
				}
				break;
			}
		}

		sc.close();

	}
}
