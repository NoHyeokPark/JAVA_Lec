package kr.ac.kopo.day0312;

import java.util.Arrays;

public class Lec0312_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loc =0;
		String[] strArr = new String[5];
		strArr[loc++] = "2025";
		strArr[loc++] = "인공지능소프트웨어";
		strArr[loc++] = "하이테크";
		strArr[loc++] = "교육";
		strArr[loc++] = "2025";
		/*
		 * 배열의 모든 원소를 출력하는 방법 3가지
		 * 1. index를 이용한 출력
		 * 2. 1.5ver for문을 이용한 출력
		 * Arrays.toString
		 */
		System.out.println("index를 이용한 출력");
		for (int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("\n1.5 for 문");
		for (String str : strArr) {
			System.out.println(str);
		}
		System.out.println("\nArrays.toString을 이용한 출력");
		String ss = Arrays.toString(strArr);
		System.out.println(ss);
	}

}
