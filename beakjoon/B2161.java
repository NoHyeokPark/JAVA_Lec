package beakjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		boolean flag = false;
		while(!q.isEmpty()) {
			if(flag) {
				q.offer(q.poll());
			} else {
				System.out.print(q.poll()+ " ");
			}
			flag = !flag;
		}
	}
}
