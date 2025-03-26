package HomeWork.d0326;

import java.util.LinkedList;
import java.util.List;

public class LottoLinkedList extends Lotto {
	@Override
	int[] getLottos() {
		int n;
		int j = 0;
		List<Integer> list = new LinkedList<>();
		int[] lottos = new int[6];
		for (int i = 1; i <= 45; i++) {
			list.add(i);
		}
		while (list.size() > 6) {        //책 581p LinkedList는 객체의 추가와 제거가 빈번할때 유리하다.
			n = r.nextInt(list.size());
			list.remove(n);
		}
		for (int i : list) {
			lottos[j++] = i;
		}

		return lottos;
	}
}
