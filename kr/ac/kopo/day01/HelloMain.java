package kr.ac.kopo.day01;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello JAVA!!");
		/*
		 * 변환문자
		 * %d 정수
		 * %f 실수
		 * %c 문자
		 * %s 문자열
		 * %b 논리값
		 * 
		 */
		
		System.out.printf("내 이름은 %s입니다. 나이는 %d살입니다.\n", "홍길동", 10);
		
		System.out.printf("%04d + %03d = %4d\n", 156, 15, 156+15);
		System.out.printf("%03d + %03d = %4d\n", 1765, 1, 1765+1);
		System.out.printf("%04d + %03d = %4d\n", 786, 351, 786+351);
		System.out.printf("%.1f\n", 12.36 - 0.05);
		System.out.printf("%.1f\n", 12.32 - 0.05);
		System.out.printf("%b", 10 < 5);




	}

}
