package kr.ac.kopo.proffesor.day11;

class One {
	One() {
		System.out.println("One() 생성자 호출...");
	}
}

class Two extends One {
	Two() {
		//super();
		System.out.println("Two() 생성자 호출...");
	}
}

class Three extends Two {
	Three() {
		super();	
		System.out.println("Three() 생성자 호출...");
	}
}

public class ExtendsMain01 {

	public static void main(String[] args) {

		//new Object();
		
//		new One();
//		new Two();
		new Three();
	}
}
