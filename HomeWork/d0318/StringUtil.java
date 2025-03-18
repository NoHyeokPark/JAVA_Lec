package HomeWork.d0318;

public class StringUtil {

	static int cnt;

	char isUpperChar(char c) {
		if (c >= 97 && c <= 122) {
			c -= 32;
		}
		return c;
	}

	char isLowerChar(char c) {
		if (c >= 65 && c <= 90) {
			c += 32;
		}
		return c;
	}

	int max(int i, int j) {
		if (i >= j) {
			return i;
		} else {
			return j;
		}
	}

	int min(int i, int j) {
		if (i < j) {
			return i;
		} else {
			return j;
		}
	}

	String reverseString(String str) {
		char[] charArr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArr[i] = str.charAt(str.length() - 1 - i);
		}
		return new String(charArr);
	}

	String toUpperString(String str) {
		char[] charArr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArr[i] = isUpperChar(str.charAt(i));
		}
		return new String(charArr);
	}

	String toLowerString(String str) {
		char[] charArr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArr[i] = isLowerChar(str.charAt(i));
		}
		return new String(charArr);
	}

	int compareTo(String str1, String str2) {
		int mini;
		char[] charArr1 = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			charArr1[i] = str1.charAt(i);
		}
		char[] charArr2 = new char[str2.length()];
		for (int i = 0; i < str2.length(); i++) {
			charArr2[i] = str2.charAt(i);
		}
		if (str1.length() < str2.length()) {
			mini = str1.length();
		} else {
			mini = str2.length();
		}
		for (int i = 0; i < mini; i++) {
			if (charArr1[i] - charArr2[i] != 0)
				return charArr1[i] - charArr2[i];
		}
		return str1.length() - str2.length();
	}

	public static int checkChar(String strData, char ch) {
		cnt = 0;
		for (int i = 0; i < strData.length(); i++) {
			if (ch == strData.charAt(i))
				cnt++;
		}
		return cnt;
	}

	public static String removeChar(String oriStr, char delChar) {
		char[] charArr = new char[oriStr.length()];
		int del = 0;
		for (int i = 0; i < oriStr.length(); i++) {
			if (oriStr.charAt(i) != delChar) {
				charArr[i - del] = oriStr.charAt(i);
			} else {
				del++;
			}
		}
		return new String(charArr);
	}

}
