package kr.ac.kopo.day0314;

public class ExamMethod {
	void printSum(int a) {
		printTotal(a,a*a);
	}
	
	/**
	 * 등차합
	 * @param a 정수
	 * @param b a보다 큰 정수
	 * @return a부터 b까지의 합
	 */
	int getTotal(int a, int b) {
		int sum = 0;
		while (a <= b) {
			sum += a++;
		}
		return sum;
	}
	
	void printTotal(int a, int b) {
		int sum = /*this.*/getTotal(a, b);
		System.out.printf("%d와 %d사이의 총합 : %d입니다.\n",a,b,sum);
	}
	
}
