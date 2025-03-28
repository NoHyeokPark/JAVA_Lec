package HomeWork.D0307;

import java.util.Scanner;

public class Day0307HW05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int score = sc.nextInt();

		if (0 <= score && score <= 100) { // 성적의 범위가 올바른지 검사합니다
			if (score >= 90) { // 90점이상부터
				System.out.println("A");
			} else if (score >= 80) { // 80~89
				System.out.println("B");
			} else if (score >= 70) { // 70~79
				System.out.println("C");
			} else if (score >= 60) { // 60~69
				System.out.println("D");
			} else { // 0~59
				System.out.println("F");
			}

		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	}

}
