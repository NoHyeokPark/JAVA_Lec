package HomeWork.d0326;

import java.util.HashSet;
import java.util.Set;

public class LottoHashSet extends Lotto {
	@Override
	int[] getLottos() {
		int i=0;
		Set<Integer> set = new HashSet<>();
		while (set.size()<6) {
			set.add(r.nextInt(45)+1);
		}
		int[] lottos = new int[6];
		for(int n : set) {
			lottos[i++] = n;
		}

		return lottos;
	}
}
