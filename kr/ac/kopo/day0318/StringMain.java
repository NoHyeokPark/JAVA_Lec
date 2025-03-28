package kr.ac.kopo.day0318;

import java.util.Arrays;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello World !!!");
		System.out.println("str : " + str);
		int idx = str.indexOf('r');
		System.out.println("r의 위치 : " + idx); // 찾는 문자의 위치를 반환한다
		idx = str.indexOf('p');
		System.out.println("p의 위치 : " + idx); // 찾는 문자가 없다면 -1을 반환한다
		idx = str.indexOf('o');
		System.out.println("o의 위치 : " + idx); // 문자열의 시작부터 찾는 문자의 첫번째 위치를 반환한다
		idx = str.lastIndexOf('o');
		System.out.println("o의 위치 : " + idx); // 문자열의 끝에서부터 찾는 문자의 첫번째 위치를 반환한다
		idx = str.indexOf("el");
		System.out.println("el의 위치 : " + idx);
		idx = str.lastIndexOf("el");
		System.out.println("el의 위치 : " + idx);
		
		System.out.println("Upper : " + str.toUpperCase());
		System.out.println("Lower : " + str.toLowerCase());
		System.out.println("replace : " + str.replaceAll("l", "1"));
		System.out.println("substring : " + str.substring(2,8));
		String[] strArr = str.split(" ");
		System.out.println("split : " + Arrays.toString(strArr));
		
		
		
	}

}
