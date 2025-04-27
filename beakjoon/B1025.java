package beakjoon;

import java.util.Scanner;

public class B1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int max = -1;
		int[][] arr = new int[x][y];
		for (int i = 0; i < x; i++) {
			int a = sc.nextInt();
			for (int j = y - 1; j >= 0; j--) {
				arr[i][j] = a % 10;
				a /= 10;
			}
		}
		int xv = 1;
		int yv = 1;
		for (int k = 0; k < x * y; k++) {
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					for (int l = 0; l < 4; l++) {
						int yy = k % y;
						int xx = k / y;
						int num = 0;
						while (yy < y && yy >= 0 && xx < x && xx >= 0) {
							if (i + j == 0) {
								num = arr[xx][yy];
								double sq = Math.sqrt(num);
								if (sq == (int) sq) {
									if (max < num) {
										max = num;
									}
								}
								break;
							} else {
								num *= 10;
								num += arr[xx][yy];
								xx += i * xv;
								yy += j * yv;
							}
							double sq = Math.sqrt(num);
							if (sq == (int) sq) {
								if (max < num) {
									max = num;
								}
							}
						}
						xv = -xv;
						if (l == 1) {
							yv = -yv;
						}
					}
				}
			}
		}
		System.out.println(max);

	}
}
