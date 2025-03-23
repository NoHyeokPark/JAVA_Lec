package house.persnal.re.icecream;
import java.util.Scanner;


public class Mart {
	private Scanner sc = new Scanner(System.in);
	private Icecream[] bucket;
	int quantity;

	Mart(){}
	
	int scanInt() {
		int i = sc.nextInt();
		sc.nextLine();
		return i;
	}
	
	void ICFreezer() {
		System.out.println("아이스크림을 몇 개 구입하시겠습니까? : ");
		quantity = scanInt();
		String name;
		int price;
		bucket = new Icecream[quantity];
		for(int i=0; i<quantity; i++){
			System.out.printf("%d번째 아이스크림 이름 : \n",i+1);
			name = sc.nextLine();
			System.out.printf("%d번째 아이스크림 가격 : \n",i+1);
			price = scanInt();
			bucket[i] = new Icecream(name, price);
		}
		this.cashDesk();
	}
	
	void cashDesk() {
		int i = 0;
		int sum = 0;
		System.out.printf("< %d개 아이스크림 구매 정보 출력 >\n", quantity);
		System.out.println("---------------------------------------");
		System.out.printf("번호\t아이스크림명\t아이스크림가격\n");
		for(Icecream IC : bucket) {
		System.out.printf(" %d\t  %s\t\t    %d\n", ++i, IC.getName(), IC.getPrice());
		sum += IC.getPrice();
		}
		System.out.println("---------------------------------------");
		System.out.printf("총합 : %d원\n", sum);
		this.rePlay();
	}
	
	void rePlay() {
		System.out.println("계속 구매하시겠습니까? : ");
		String re = sc.nextLine();
		if (re.charAt(0) == 'Y' || re.charAt(0) == 'y' || re.charAt(0) == '예' || re.charAt(0) == '네') {
			this.ICFreezer();
		}
	}
	}

