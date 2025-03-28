package kr.ac.kopo.day0319;


public class Lec0319Main {

	public static void main(String[] args) {
		
		Three tr = new Three();
		
		One one = new Three();
		
		one.info();
		
		Two too = (Two)one;
		
		too.toto();
		
		Three t = (Three)one;
		
		t.tree();
		
		System.out.println(one instanceof One);
		System.out.println(tr instanceof One);
	}

}
