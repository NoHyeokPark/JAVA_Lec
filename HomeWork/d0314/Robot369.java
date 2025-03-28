package HomeWork.d0314;

public class Robot369 {

	/**
	 * 안녕하세요 저는 끝자리가 3,6,9로 끝나는지 검사하는 모듈 오메가 입니다
	 * 
	 * @param i 세는중인 숫자
	 */
	void omega(int i, boolean ten) {
		if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
			System.out.println("짝");
		} else {
			System.out.println(ten ? "" : i);
		}
		i++;
	}

	/**
	 * 저는 10 단위로 끝나면 뽀숑을 붙이는 로봇 크레이지 텐 입니다 저는 작업이 끝나면 자동으로 오메가에게 연계합니다.
	 * 
	 * @param i 세는중인 숫자
	 */
	void crazyTen(int i, boolean ten) {
		if (i % 10 == 0) {
			for (int j = 0; j < i / 10; j++) {
				System.out.print("뽀");
			}
			System.out.println("숑");
			i++;
		} else {
			omega(i, ten);
		}
	}

	/**
	 * 안녕하세요 저는 일의자리를 제외하고 모든 3,6,9를 포함하는지 검사하는 로봇 프라임입니다
	 * 
	 * @param i 세는중인 숫자
	 */
	void prime(int i) {
		int j = i;
		boolean ten = false;
		while (true) {
			if (j >= 10) {
				j /= 10;
				if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) {
					System.out.print("짝");
					ten = true;
				}
			} else {
				break;
			}
		}
		crazyTen(i, ten);

	}

	/**
	 * 저는 정해주신 숫자까지 로봇에게 369게임을 시키는 마스터 입니다
	 * 
	 * @param i 게임 종료 숫자
	 */
	void master(int i) {
		for (int j = 1; j <= i; j++) {
			prime(j);
		}
	}
}
