package HomeWork.d0312;

import java.util.Scanner;

public class Day0312HW01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gae;
		int sum = 0;
		IceCream[] market = new IceCream[99];
		out: while (true) {
			System.out.println("아이스크림 몇 개 구입할래? : ");
			gae = sc.nextInt();
			sc.nextLine();

			// 아이스크림 입력받기
			for (int i = 0; i < gae; i++) {
				market[i] = new IceCream();
				System.out.printf("***\t%d 번째 아이스크림 구매 정보 입력\t***\n", i + 1);
				System.out.printf("아이스크림 이름 : \n");
				market[i].name = sc.nextLine();
				System.out.printf("아이스크림 가격 : \n");
				market[i].price = sc.nextInt();
				sc.nextLine();
			}

			// 출력부
			System.out.printf("< %d개 아이스크림 구매 정보 출력 >\n", gae);
			System.out.printf("번호\t아이스크림명\t\t아이스크림가격\n");
			for (int i = 0; i < gae; i++) {
				System.out.printf("%d\t%s\t%d\n", i + 1, market[i].name, market[i].price);
				sum += market[i].price;
			}
			System.out.printf("총합 : %d원\n", sum);

			System.out.println("계속구매할까?(Y/N)");
			if ("N".equals(sc.nextLine())) {
				break out;
			}

		}
		sc.close();
	}

}
