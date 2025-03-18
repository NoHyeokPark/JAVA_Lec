package HomeWork.d0318;

public class Calculator {

	Calculator() {
	}

	void Calculating(int a, int b) {
		System.out.println("정수 : " + a);
		System.out.println();
		System.out.println("정수 : " + b);
		System.out.println();
		System.out.println();
		System.out.printf("%d + %d = %d\n", a, b, add(a, b));
		System.out.printf("%d - %d = %d\n", a, b, sub(a, b));
		System.out.printf("%d * %d = %d\n", a, b, mul(a, b));
		System.out.printf("%d / %d = %d\n", a, b, div(a, b));
		System.out.println();
		System.out.println();
		System.out.printf("%d 소수체크 : %b\n", a, prime(a));
		System.out.println();
		System.out.printf("%d 소수체크 : %b\n", b, prime(b));
	}

	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	int div(int a, int b) {
		return a / b;
	}

	boolean prime(int a) {
		for (int i = a - 1; i > 1; i--) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
