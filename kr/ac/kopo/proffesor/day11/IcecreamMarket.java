package kr.ac.kopo.proffesor.day11;

import java.util.Scanner;

public class IcecreamMarket {

	Icecream[] iceArr;
	
	int scanInt(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	String scanStr(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		String data = sc.nextLine();
		
		return data;
	}
	
	void buySomthing() {
		int cnt = scanInt("아이스크림 몇개 구입할래? => ");
		iceArr = new Icecream[cnt];
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i+1) + "번째 아이스크림 입력 ***");
			String 	name  = scanStr("아이스크림명 : ");
			int 	price = scanInt("아이스크림 가격 : "); 
			
			iceArr[i] = new Icecream(name, price);			
		}
	}
	
	void printReceipt() {
		
		System.out.println("***** " + iceArr.length + "개 아이스크림 구매정보 출력 *****");
		System.out.println("번호\t아이스크림명\t아이스크림 가격");
		System.out.println("-----------------------------------------");
		for(int i = 0; i < iceArr.length; i++) {
			Icecream ice = iceArr[i];
			System.out.printf("%2d\t%s\t\t%d\n", i+1, ice.getName(), ice.getPrice());
		}
		System.out.println("-----------------------------------------");
		
	}
	
	void open() {
		
		buySomthing();
		printReceipt();
	}
}





