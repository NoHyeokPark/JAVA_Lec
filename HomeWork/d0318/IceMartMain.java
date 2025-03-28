package HomeWork.d0318;

import java.util.Scanner;

public class IceMartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		int sum = 0;
		String eat;
		System.out.println("아이스크림 몇 개 구입할래? : ");
		int quantity = sc.nextInt();
		sc.nextLine();
		IceMart[] cart = new IceMart[quantity];
		for (IceMart daiso : cart) {
			sum = daiso.bucket();
		}
		System.out.printf("< %d개 아이스크림 구매 정보 출력 >\n", quantity);
		for (IceMart daiso : cart) {
			daiso.cashDesk();
		}
		System.out.printf("총합 : %d원\n", sum);
		System.out.println("계속 구매할래? : ");
		eat = sc.nextLine();
		if (eat.charAt(0) == 'Y' || eat.charAt(0) == 'y') {
			IceMart.reset();
		} else {
			break;
		}
		}
		sc.close();
	}

}
