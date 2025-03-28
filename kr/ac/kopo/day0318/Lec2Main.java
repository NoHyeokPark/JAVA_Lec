package kr.ac.kopo.day0318;

public class Lec2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"길동","길순","대길","예쁜","길동","철수","길수","길동"};
		
		//이름이 길동인 사람만 출력
		System.out.println("<<<이름이 길동인 사람 출력>>>");
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("길동")) {
				System.out.println(names[i]);
			}
		}
		//이름에 '길' 이 포함된 사람 출력
		System.out.println("<<<이름에 '길' 이 포함된 사람 출력>>>");
		for(String name : names) {
			if(name.contains("길")) {
				System.out.println(name);
			}
		}
	}

}
