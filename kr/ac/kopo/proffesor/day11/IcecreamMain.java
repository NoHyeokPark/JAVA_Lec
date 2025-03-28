package kr.ac.kopo.proffesor.day11;

public class IcecreamMain {

	static void print() {
		System.out.println("**********************");
	}
	
	public static void main(String[] args) {

		print();
		IcecreamMarket market = new IcecreamMarket();
		market.open();
		print();
		
	}
}
