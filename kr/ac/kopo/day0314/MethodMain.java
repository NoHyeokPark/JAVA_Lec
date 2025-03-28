package kr.ac.kopo.day0314;

public class MethodMain {

	public static void main(String[] args) {
		Method m = new Method();
		m.call();
		m.call2(4.23);
		System.out.println("반환받은 숫자는 " + m.call3(19999) + "입니다.");
	}

}
