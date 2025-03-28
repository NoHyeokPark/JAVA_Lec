package kr.ac.kopo.day0314;

public class Method {

	void call() {
		System.out.println("call() 메소드 호출!!");
	}

	void call2(int i) {
		for (int j = 0; j < i; j++) {
			System.out.println("call2(int) 메소드 호출!! " + i + "번 반복합니다.");
		}

	}

	int call3(int i) {
		System.out.println("call3() 메소드 호출!!" + i + "를 반환합니다.");
		return i;
	}
	
	/*
	 * 메소드 오버로딩
	 * 같은 클레스 내에 메소드 명은 '동일'한데 매개변수의 갯수나 타입이 '다른' 것
	 */
	
	void call2(double i) {
		for (int j = 0; j < i; j++) {
			System.out.println("call2(double) 메소드 호출!! " + i + "번 반복합니다.");
		}

	}
	void call2(char i) {
		for (int j = 0; j < i; j++) {
			System.out.println("call2(char) 메소드 호출!! " + i + "번 반복합니다.");
		}
}
}
