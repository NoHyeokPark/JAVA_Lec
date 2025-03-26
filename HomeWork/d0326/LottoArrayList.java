package HomeWork.d0326;

import java.util.ArrayList;
import java.util.List;

public class LottoArrayList extends Lotto {
	@Override
	int[] getLottos() {
		int n;
		List<Integer> list = new ArrayList<>();
		int[] lottos = new int[6];
		for (int i = 1; i <= 45; i++) {
			list.add(i);
		}
		for (int i = 0; i < 6; i++) {
			n = r.nextInt(list.size());
			lottos[i] = list.remove(n);
		}

		return lottos;
	}
}
