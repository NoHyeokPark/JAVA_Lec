package HomeWork.D0307;

import java.util.Random;

public class Day0307HW08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int nomal = 0; // 특별한수(3을포함하거나 10의배수)가 아닐경우를 체크하기위한 변수
		int game = r.nextInt(91) + 10; // 0~90까지의 랜덤값을 받아온뒤 +10을 해서 10~100범위로 조정합니다
		for (int i = 1; i <= game; i++) {
			if (i > 29 && i / 10 % 3 == 0) {
				nomal = 1;
				System.out.print("짝"); // 십의자리에 3을 포함할경우 짝 을 출력합니다
			}
			if (i % 10 != 0 && i % 10 % 3 == 0) {
				nomal = 1;
				System.out.print("짝"); // 일의 자리에 3을 포함할경우 짝 을 출력합니다
			}
			if (i % 10 == 0) {
				nomal = 1;
				for (int j = 0; j < i / 10; j++) {
					System.out.print("뽀"); // 10의 배수일경우 십의자리수만큼 뽀 를 출력합니다
				}
				System.out.print("숑"); // 출력된 뽀 뒤에 숑을 붙이고 줄을 바꿉니다
			}
			if (nomal == 0) { // 짝 과 뽀숑에 모두 해당하지 않을경우 숫자를 출력합니다
				System.out.print(i);
			}
			nomal = 0;
			System.out.println(); // 줄바꿈
		}

	}

}
