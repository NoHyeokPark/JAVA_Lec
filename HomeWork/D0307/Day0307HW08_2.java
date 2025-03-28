package HomeWork.D0307;

import java.util.Random;

public class Day0307HW08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int game = r.nextInt(91) + 10;
		int num1 = 1;
		int i = -1;
		System.out.println(game);
		while (true) {
			while (i < 3) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 2; k++) {
						if (i == 2) {
							System.out.print("짝");
						}
						System.out.println(num1++);
						if (num1 == game+1) {
							System.exit(0);
						}
					}
					if (i == 2) {
						System.out.print("짝");
					}
					System.out.println("짝");
					num1++;
					if (num1 == game+1) {
						System.exit(0);
					}
				}

				for (int j = 0; j < num1 / 10; j++) {
					System.out.print("뽀");
				}

				System.out.println("숑");
				num1++;
				if (num1 == game+1) {
					System.exit(0);
				}
				i++;
			}
			i = 0;
		}
	}

}
