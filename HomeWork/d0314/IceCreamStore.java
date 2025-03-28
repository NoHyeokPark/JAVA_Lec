package HomeWork.d0314;

import java.util.Scanner;

public class IceCreamStore {
	String name;
	int price;
	Scanner sc = new Scanner(System.in);

	/**
	 * 아이스크림 갯수를 물어보는 메소드 쇼핑입니다
	 */
	void shopping() {
		System.out.println("아이스크림 몇 개 구입할래? : ");
		bucket (sc.nextInt());

	}
/**
 * 아이스크림 정보를 받는 메소드 버켓입니다
 * @param quantity 아이스크림의 양
 */
	void bucket(int quantity) {
		sc.nextLine();
		int sum = 0;
		IceCreamStore[] cart = new IceCreamStore[quantity];
		for (int i = 0; i < quantity; i++) {
			cart[i] = new IceCreamStore();
			System.out.printf("***\t%d 번째 아이스크림 구매 정보 입력\t***\n", i + 1);
			System.out.printf("아이스크림 이름 : \n");
			cart[i].name = sc.nextLine();
			System.out.printf("아이스크림 가격 : \n");
			cart[i].price = sc.nextInt();
			sc.nextLine();
			sum += cart[i].price;
		}
		cashDesk(quantity,sum,cart);
	}
	/**
	 * 아이스크림 영수증을 떼주는 캐쉬데스크입니다
	 * @param quantity 아이스크림의 양
	 * @param sum 아이스크림의 총 가격
	 * @param cart 아이스크림의 종류와 가격을 담은 배열
	 */
	void cashDesk(int quantity, int sum, IceCreamStore[] cart) {
		System.out.printf("< %d개 아이스크림 구매 정보 출력 >\n", quantity);
		for (int i = 0; i < quantity; i++) {
		System.out.printf("번호\t아이스크림명\t아이스크림가격\n");
		System.out.printf("%d\t%s\t\t%d\n", i + 1, cart[i].name, cart[i].price);
		}
		System.out.printf("총합 : %d원\n", sum);
		System.out.println("계속구매할까?(Y/N)");
		entrance(sc.nextLine());
		
	}
/**
 * 더 사거나 끝내고 나갈수 있는 메소드 엔트런스입니다
 * @param eat
 */
	void entrance(String eat) {
		if (eat.charAt(0) == 'Y' || eat.charAt(0) == 'y') {
			shopping();
		}
	}
}
