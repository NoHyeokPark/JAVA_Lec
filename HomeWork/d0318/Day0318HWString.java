package HomeWork.d0318;

public class Day0318HWString {

	public static void main(String[] args) {
		char a = 'a'; // 97 ~ 122
		char b = 'A'; // 65 ~ 90
		String as = "Hello World Java";
		String bs = "Hello World C++";
		int c = 1;
		int d = 9;
		StringUtil su = new StringUtil();
		System.out.println(su.isUpperChar(b));
		System.out.println(su.isLowerChar(a));
		System.out.println(su.max(c, d));
		System.out.println(su.min(c, d));
		System.out.println(su.reverseString(as));
		System.out.println(su.toUpperString(as));
		System.out.println(su.toLowerString(as));
		System.out.println("만든 메소드 컴페어 : " + su.compareTo(as, bs));
		System.out.println("기존 메소드 컴페어 : " + as.compareTo(bs));
		System.out.println("입력스트링 :String strData = " + as);
		System.out.println("ch = 'o' 인 경우 => " + StringUtil.checkChar(as, 'o'));
		System.out.println("ch = 'W' 인 경우 => " + StringUtil.checkChar(as, 'W'));
		System.out.println("입력스트링 :String oriStr = " + as);
		System.out.println("delChar = 'l' 인 경우 => " + StringUtil.removeChar(as, 'l'));
		System.out.println("delChar = 'o' 인 경우 => " + StringUtil.removeChar(as, 'o'));

	}

}
