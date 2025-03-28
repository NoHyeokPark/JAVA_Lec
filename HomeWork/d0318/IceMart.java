package HomeWork.d0318;

import java.util.Scanner;

public class IceMart {
	static int cnt=1;
	int num;
	String name;
	int price;
	Scanner sc = new Scanner(System.in);

	IceMart(){
		num = IceMart.cnt++;
	}
/**
 * 아이스크림 정보를 받는 메소드 버켓입니다
 */
	int bucket() {
		    System.out.printf("***\t%d 번째 아이스크림 구매 정보 입력\t***\n", num);
			System.out.printf("아이스크림 이름 : \n");
			name = sc.nextLine();
			System.out.printf("아이스크림 가격 : \n");
			price = sc.nextInt();
			sc.nextLine();
			return price;
	}
	/*
	 * 아이스크림 영수증을 떼주는 캐쉬데스크입니다
	 */
	void cashDesk() {
		System.out.printf("번호\t아이스크림명\t아이스크림가격\n");
		System.out.printf("%d\t%s\t\t%d\n", num, name, price);
	}
	
	static void reset() {
		IceMart.cnt=1;
	}

}
