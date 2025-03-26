package HomeWork.d0326;

public class LottoArray extends Lotto {
	@Override
	int[] getLottos() {

		int n;
		int[] lottos = { 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < 6;) {
			n = r.nextInt(45) + 1;
			for (int j = 0; j < 6;) {
				if (lottos[j] == n) {
					break;
				} else if (lottos[j] == 0) {
					lottos[j] = n;
					i++;
					break;
				} else {
					j++;
				}
			}
		}

		return lottos;
	}

}
