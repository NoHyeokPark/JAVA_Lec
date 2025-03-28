package kr.ac.kopo.day0318;

import work.test1.MethodOver;
import work.test1.MethodOverride;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;

		MethodOver older = new MethodOver();
		System.out.println("원면적 : " + older.areaCircle(r));
		
		MethodOverride young = new MethodOverride();
		System.out.println("원면적 : " + young.areaCircle(r));

	}

}
