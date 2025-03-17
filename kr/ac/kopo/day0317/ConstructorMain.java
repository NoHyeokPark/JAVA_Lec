package kr.ac.kopo.day0317;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		Member m2 = new Member("홍길동");
		Member m3 = new Member("홍길순", 24, false, 'O');
		
		m.info();
		m2.info();
		m3.info();
	}

}
