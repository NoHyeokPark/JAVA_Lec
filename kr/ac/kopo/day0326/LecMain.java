package kr.ac.kopo.day0326;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LecMain {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		List<Object> list2 = new ArrayList<Object>();
		List<String> list3 = new ArrayList<>();
		
		System.out.println("전체 원소의 개수 : " + list.size());
		
		list.add("1");
		list.add("2");
		list.add("");
		list.add("");
		list.add("");
		// add 메소드는 T/F값을 리턴한다.
		list3.add("");
		
		list.removeAll(list3); // list3에 있는 원소랑 같은 원소 다 지움
		
		
		System.out.println("전체 원소의 개수 : " + list.size());

		System.out.println("첫번째 원소 : " + list.getFirst());
		
		System.out.println("삭제된 원소 : "+ list.remove(0));
		// remove(i)는 삭제된 값을 리턴함 <String>에서는 String
		
		System.out.println("첫번째 원소 : " + list.getFirst());
		
		list.add(0, "새치기");
		
		System.out.println("첫번째 원소 : " + list.getFirst());
		// set.iterator(); <- =순환자 : 집합의 데이터를 처음부터 끝까지 접근할수 있게 만들어진 객체를 반환하는 메소드
		// 객체.hasNext() 다음 데이터가 있냐고 물어보기 T/F 객체.next() 다음 데이터로 옮겨가기

	}

}
