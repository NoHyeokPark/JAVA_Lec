package kr.ac.kopo.day0310;

public class Lec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1111111111111111111111111111111111111111111111111111
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		// 2222222222222222222222222222222222222222222222222222222222
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(5 - i);
			}
			System.out.println();
		}

		System.out.println();
		// 333333333333333333333333333333333333333333333333333333333
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.printf("%d", i + j);
			}
			System.out.println();
		}

		System.out.println();
		// 4444444444444444444444444444444444444444444444444444
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		// 55555555555555555555555555555555555555555555555555555
		for (int i = -4; i < 5; i++) {
			for (int j = 0; j < 5 - Math.abs(i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		// 66666666666666666666666666666666666666666666666666666666666
		for (int i = 0; i < 9; i++) {
			if (i <= 4) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 5; j > i; j--) {
					System.out.print("*");
				}
			} else {
				for (int j = 8; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 3; j < i; j++) {
					System.out.print("*");
				}
			}

			System.out.println();

		}
		System.out.println();
		// 66666666666666666666666666666666-22222222222222222
		for (int i = -4; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j - Math.abs(i) > 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();

        //77777777777777777777777777777777777777777777777777
		for (int i = 0; i < 9; i++) {
			if (i <= 4) {

				for (int j = 5; j > i; j--) {
					System.out.print("*");
				}
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
			} else {

				for (int j = 3; j < i; j++) {
					System.out.print("*");
				}
				for (int j = 8; j > i; j--) {
					System.out.print(" ");
				}
			}

			System.out.println();

		}
		System.out.println();

		// 8888888888888888888888888888888888888888888888888888888
		for (int i = 0; i < 9; i++) {
			if (i <= 4) {
				for (int j = 4; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = -1; j < i; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = 4; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 9; j > i; j--) {
					System.out.print("*");
				}

			}

			System.out.println();

		}
		System.out.println();
		// 9999999999999999999999999999999999999999999999999999999

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1 + 2 * i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println();

		// die amond 1010101101010100101010101010101010
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 4; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < 1 + 2 * i; j++) {
					System.out.print("*");
				}

				System.out.println();
			} else {
				for (int j = 4; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 18; j > 1 + 2 * i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		// 1111111111111111111111111111111111111111111111111111111111
		for (int i = 0; i < 9; i++) {
			if (i < 4) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				for (int j = 8; j > 1 + 2 * i; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i > 4) {
				for (int j = 9; j > i; j--) {
					System.out.print("*");
				}
				for (int j = 10; j < 1 + 2 * i; j++) {
					System.out.print(" ");
				}
				for (int j = 9; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 9; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		// 11-222222222222222222222222222222222222222222222222222222222222222222
		System.out.println();
		for (int i = -4; i < 5; i++) {
			for (int j = -4; j < 5; j++) {
				if (Math.abs(i) - Math.abs(j) > 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

}
