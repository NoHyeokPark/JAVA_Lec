package work.test1;

public class Star10 {

	public static void main(String[] args) {
		for (int n = 7; n > 0; n--) {
			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < 3; i++) {

					if (i == 1 && n%2 ==0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				

				}
			}
			System.out.println();
		}
	}

}
