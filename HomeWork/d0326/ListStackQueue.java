package HomeWork.d0326;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// List 활용하여 스택, 큐 특징을 가지도록 작성
// 1. 스택입력 2.스택삭제 3.큐입력 4.큐삭제 5.데이터 출력(순서대로) 6.종료
public class ListStackQueue {

	private List<Integer> sq = new LinkedList<>();
	private Scanner sc = new Scanner(System.in);

	public void on() {
		System.out.println("1. 스택입력 2.스택삭제 3.큐입력 4.큐삭제 5.데이터 출력(순서대로) 6.종료");

		switch (sc.nextInt()) {
		case 1:
			push(inint("STACK 입력 : "));
			break;
		case 2:
			if (!sq.isEmpty()) {
				System.out.println("제거된 데이터 : " + pop());
			} else {
				System.out.println("현재 데이터가 비어있습니다.");
			}
			break;
		case 3:
			offer(inint("Queue 입력 : "));
			break;
		case 4:
			if (!sq.isEmpty()) {
				System.out.println("제거된 데이터 : " + poll());
			} else {
				System.out.println("현재 데이터가 비어있습니다.");
			}
			break;
		case 5:
			System.out.println(sq.toString());
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		on();
	}

	int inint(String msg) {
		System.out.println(msg);
		return sc.nextInt();
	}

	int push(int a) {
		sq.add(a);
		return a;
	}

	int pop() {
		return sq.removeLast();

	}

	boolean offer(int a) {
		try {
			sq.add(a);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	int poll() {
		return sq.removeFirst();
	}

}
