package HomeWork.d0326;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottoHashSet extends Lotto {
	@Override
	int[] getLottos() {
		int n = (r.nextInt(100)+100)*(r.nextInt(100)+100);
		Set<Integer> set = new HashSet<>();
		for (int i=1; i<=45; i++) {
			set.add(i*n);
		}
		int[] lottos = new int[6];
		Iterator<Integer> it = set.iterator();
		for(int i=0; i<6; i++) {
			lottos[i] = it.next()/n;
		}
		
		return lottos;
	}
}
