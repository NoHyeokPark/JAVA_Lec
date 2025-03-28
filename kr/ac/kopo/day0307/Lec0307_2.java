package kr.ac.kopo.day0307;
import java.util.Random;
import java.util.Scanner;

public class Lec0307_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("입력된 정수 : " + num);
		
		Random r = new Random();
		int b = r.nextInt(10);
		System.out.println("추출된 한자리 정수 : " + b);
		
		sc.close();
		
		
	}
	

}
