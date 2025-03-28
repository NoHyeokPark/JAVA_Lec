package kr.ac.kopo.day0312;

import java.util.Arrays;

public class Lec0312_3 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };

		int[] num2 = num; // Shallow copy(얕은복사) 실제 숫자가 복사된것이 아니라 num의 주소값이 num2로 복사됨

		System.out.println("num : " + Arrays.toString(num));
		System.out.println("num2 : " + Arrays.toString(num2));
		

		num2[2] = 9999;

		System.out.println("num : " + Arrays.toString(num));
		System.out.println("num2 : " + Arrays.toString(num2));

		int[] num3 = new int[num.length];
		System.arraycopy(num, 0, num3, 0,num.length);
		/*
		for (int i = 0; i < num.length; i++) {        // Deep copy (깊은복사) 다른 주소의 배열에 실제 값을 복사함
			num3[i] = num[i];
		}
		*/
		num3[2] = 77777;
		
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("num2 : " + Arrays.toString(num3));
	}
}
