package kr.ac.kopo.day01;

//import java.lang.String; //자동으로 적용되어 있어서 따로 적지 않아도 됨
import java.util.Random; // 임포트 해야만 축약해서 사용할수 있음 

public class DataTypeMain {

	public static void main(String[] args) {
		String str = "Hello"; //String만 예외로 new 생략가능
		Random r; //임포트 안했을시 java.util.Random 의 형태로 사용
		r = new Random();
		System.out.println(str + r);

	}

}
