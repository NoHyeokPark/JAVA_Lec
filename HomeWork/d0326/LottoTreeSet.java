package HomeWork.d0326;

import java.util.Set;
import java.util.TreeSet;

public class LottoTreeSet extends Lotto {
	
	@Override
	int[] getLottos() {
		int i=0;
		Set<Integer> set = new TreeSet<>();
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
