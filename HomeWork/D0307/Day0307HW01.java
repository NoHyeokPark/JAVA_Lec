package HomeWork.D0307;

import java.util.Scanner;

public class Day0307HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("물건값을 입력하세요 : ");
		int price = sc.nextInt();

		System.out.println("지불할 돈의 액수를 입력하세요 : ");
		int money = sc.nextInt(); // 여기까지 입력부입니다

		int change = money - price; // 거스름돈을 계산합니다

		if (change < 0) {
			System.out.println(-change + "원이 부족합니다."); // 돈이 부족할경우
		} else {
			System.out.printf("거스름돈 : %d 원\n", change); // 돈이 충분할경우
			int coin[] = { 1000, 500, 100, 50, 10 };
			for (int i = 0; i < 5; i++) {
				System.out.printf("%d원 : %d개\n", coin[i], change / coin[i]);
				change %= coin[i];
			}
		}

		sc.close();
	}

}
