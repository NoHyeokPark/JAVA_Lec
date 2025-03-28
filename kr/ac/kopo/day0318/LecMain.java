package kr.ac.kopo.day0318;

public class LecMain {

	public static void main(String[] args) {
	String str = "HELLO";
	String str2 = "HELLO";
	String str3 = new String("HELLO");
	String str4 = new String("Hello");
	
	System.out.printf("==비교 : str 과 str2 는 같다? [%b]\n", str == str2);
	System.out.printf("==비교 : str 과 str3 는 같다? [%b]\n", str == str3);
	// 주소가 비교되기 때문
	
	System.out.printf("equals비교 : str 과 str2 는 같다? [%b]\n", str.equals(str2));
	System.out.printf("equals비교 : str 과 str3 는 같다? [%b]\n", str.equals(str3));
	// 내용을 비교함
	System.out.printf("equals비교 : HELLO 와 Hello 는 같다? [%b]\n", str.equals(str4));
	System.out.printf("equalsIgnoreCase비교 : HELLO 과 Hello 는 같다? [%b]\n", str.equalsIgnoreCase(str4));
	}

}
