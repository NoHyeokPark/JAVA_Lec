package HomeWork.D0311;

import java.util.Scanner;

public class Day0311HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		String odd = "";
		String even = "";
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.printf("num%d : ", i + 1);
			num[i] = sc.nextInt();
			if (num[i] % 2 == 0) {
				even += num[i] + "  ";
				evenSum += num[i];
			} else {
				odd += num[i] + "  ";
				oddSum += num[i];
			}
		}
		System.out.printf("< 짝수 >\n%s\n총합 : %d\n", even, evenSum);
		System.out.printf("< 홀수 >\n%s\n총합 : %d\n", odd, oddSum);
		sc.close();
	}

}
