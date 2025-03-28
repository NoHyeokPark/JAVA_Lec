package HomeWork.D0311;

import java.util.Scanner;

public class Day0311HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d's 성적 : ", i + 1);
			a[i] = sc.nextInt();
		}
		char[] b = new char[a.length];
		int countError = 0;
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0 && a[i] <= 100) {
				switch (a[i] / 10) {
				case 10:
				case 9: { // 90점 이상인 경우
					b[i] = 'A';
					break;
				}
				case 8: { // 80~89
					b[i] = 'B';
					break;
				}
				case 7: { // 70~79
					b[i] = 'C';
					break;
				}
				case 6: { // 60~69
					b[i] = 'D';
					break;
				}
				default: // 60미만
					b[i] = 'F';
				}
				sum += a[i];
			} else { // 오류가 날 경우
				b[i] = 'E';
				countError++;
			}
		}
		System.out.println("번호\t성적\t학점");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(" %d\t", i + 1);
			if (b[i] != 'E') {
				System.out.printf("%d\t%c\n", a[i], b[i]);
			} else {
				System.out.printf("ERROR!!!\n");
			}
		}
		if (countError > 0) {
			System.out.printf("%d명 입력 중 [%d]회 에러발생!!!\n", a.length, countError);
		}
		System.out.printf("총점 : %d 점\n평균 : %.2f점", sum, (double) sum / (a.length - countError));
		sc.close();
	}

}
