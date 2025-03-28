package HomeWork.d0314;

import java.util.Random;

public class Day0314HW01 {

	public static void main(String[] args) {
		Random r = new Random();
		int game = r.nextInt(991) + 10; //10~999까지로 범위를 늘렸습니다
		Robot369 r369 = new Robot369();
		r369.master(game);
	}

}
