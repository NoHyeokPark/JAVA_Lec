package kr.ac.kopo.day0317;


/*
 * 생성자의 특징
 * 1. 클레스명과 동일
 * 2. 디폴트 생성자 지원
 * 3. 반환형 없음
 * 4. 오버로딩 지원
 * 5. 객체 초기화(맴버변수 초기화)
 */
public class Dog {
	
	Dog() {
		System.out.println("디폴트 생성자 효출");
	}
	Dog(String s) {
		System.out.println("문자열 생성자 효출");
	}
	Dog(String s, String a) {
		System.out.println("문자열x2 생성자 효출");
	}
}
