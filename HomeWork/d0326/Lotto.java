package HomeWork.d0326;


import java.util.Arrays;
import java.util.Random;




class Lotto {
	Random r = new Random();

	int[] getLottos() {

		// 랜덤하게 1 ~ 45사이의 중복되지 않는 숫자 6개 추출

		int[] lottos = new int[6];

		return lottos;
	}

}

class LottoGame {

	private Lotto lotto = new LottoHashSet();

	void play() {

		for (int game = 0; game < 10; game++) {

//            게임 1 : [4, 12, 9, 45, 38, 7] 
//            게임 2 :
			int[] lottos = sort(lotto.getLottos());
			System.out.println(Arrays.toString(lottos));
		}

	}

	int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return arr;
	}

}