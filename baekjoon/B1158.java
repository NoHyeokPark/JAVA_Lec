package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.offer(i + 1);
		}
		int cnt = 1;
		while (!q.isEmpty()) {
			if (cnt < m) {
				q.offer(q.poll());
				cnt++;
			} else {
				ll.add(q.poll());
				cnt = 1;
			}
		}
		System.out.println(ll.toString().replace('[', '<').replace(']', '>'));
	}
}
