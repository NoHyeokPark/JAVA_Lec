package HomeWork.D0307;

import java.util.Scanner;

public class Day0307HW05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int score = sc.nextInt();
		int wrong = 100 >= score && score >= 0 ? 1 : 0; // 범위가 올바른지 검사합니다

		switch (wrong) {
		case 1: { // 올바른 범위인 경우

			switch (score / 10) {
			case 10:
			case 9: { // 90점 이상인 경우
				System.out.println("A");
				break;
			}
			case 8: { // 80~89
				System.out.println("B");
				break;
			}
			case 7: { // 70~79
				System.out.println("C");
				break;
			}
			case 6: { // 60~69
				System.out.println("D");
				break;
			}
			default: // 60미만
				System.out.println("F");
			}
			break;
		}
		default: // 범위가 잘못된경우
			System.out.println("잘못입력하셨습니다.");
		}

		sc.close();

	}

}
