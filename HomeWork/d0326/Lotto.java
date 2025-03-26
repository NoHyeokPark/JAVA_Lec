package HomeWork.d0326;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Lotto {
	Random r = new Random();

	int[] getLottos() {

		// 랜덤하게 1 ~ 45사이의 중복되지 않는 숫자 6개 추출

		int[] lottos = new int[6];

		return lottos;
	}

}

class LottoGame {

	private Lotto lotto;

	void play() {
		System.out.println("---------------------------------");
		for (int game = 0; game < 10; game++) {

//            게임 1 : [4, 12, 9, 45, 38, 7] 
//            게임 2 :
			int[] lottos = sort(lotto.getLottos());
			System.out.print(game + "번 게임 : ");
			System.out.println(Arrays.toString(lottos));
		}
		System.out.println("---------------------------------");

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

	void choise() {
		System.out.println("\t게임 버전을 선택하세요 1~5");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			lotto = new LottoArray();
			System.out.println("\tArray 버전이 선택되었습니다");
			break;
		case 2:
			lotto = new LottoArrayList();
			System.out.println("\tArrayList 버전이 선택되었습니다");
			break;
		case 3:
			lotto = new LottoLinkedList();
			System.out.println("\tLinkedList 버전이 선택되었습니다");
			break;
		case 4:
			lotto = new LottoHashSet();
			System.out.println("\tHashSet 버전이 선택되었습니다");
			break;
		case 5:
			lotto = new LottoTreeSet();
			System.out.println("\tTreeSet 버전이 선택되었습니다");
			break;
		default:
			System.out.println("\t잘못된 입력입니다 종료합니다.");
			System.exit(0);
			break;
		}
	}

}