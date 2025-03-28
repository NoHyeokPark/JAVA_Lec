package HomeWork.D0310;

import java.util.Scanner;

public class HomeworkType1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("32비트 utf-8을 입력해주세요");
		String utf = sc.nextLine();
		String[] code = { "", "", "", "" };
		for (int i = 0; i < utf.length(); i += 8) {
			code[i / 8] = utf.substring(i, i + 8);
		}

		String compliteCode = "";
		int bite = 0;
		int translator;

		for (int j = 0; j < utf.length() / 8; j++) {
			for (int i = 0; i < 5; i++) {
				if (code[0].charAt(i) == '0') {
					break;
				} else {
					bite++;
				}
			}
			switch (bite) {
			case 0:
				compliteCode = code[0].substring(1, 8);
				translator = Integer.parseInt(compliteCode, 2);
				System.out.println("유니코드(2진수) : " + Integer.toBinaryString(translator));
				System.out.println("유니코드(16진수) : " + Integer.toHexString(translator));
				System.out.println("해당하는 글자 : " + (char) translator);
				System.out.println();
				code[0] = code[1];
				code[1] = code[2];
				code[2] = code[3];
				break;
			case 2:
				compliteCode = code[0].substring(3, 8) + code[1].substring(2, 8);
				translator = Integer.parseInt(compliteCode, 2);
				System.out.println("유니코드(2진수) : " + Integer.toBinaryString(translator));
				System.out.println("유니코드(16진수) : " + Integer.toHexString(translator));
				System.out.println("해당하는 글자 : " + (char) translator);
				System.out.println();
				code[0] = code[2];
				code[1] = code[3];
				j++;
				break;
			case 3:
				compliteCode = code[0].substring(4, 8) + code[1].substring(2, 8) + code[2].substring(2, 8);
				translator = Integer.parseInt(compliteCode, 2);
				System.out.println("유니코드(2진수) : " + Integer.toBinaryString(translator));
				System.out.println("유니코드(16진수) : " + Integer.toHexString(translator));
				System.out.println("해당하는 글자 : " + (char) translator);
				System.out.println();
				code[0] = code[3];
				j += 2;
				break;
			case 4:
				compliteCode = code[0].substring(5, 8) + code[1].substring(2, 8) + code[2].substring(2, 8)
						+ code[3].substring(2, 8);
				translator = Integer.parseInt(compliteCode, 2);
				System.out.println("유니코드(2진수) : " + Integer.toBinaryString(translator));
				System.out.println("유니코드(16진수) : " + Integer.toHexString(translator));
				System.out.println("해당하는 글자 : " + (char) translator);
				System.out.println();
				j += 3;
				break;
			default:
				System.out.println("UTF-8 코드가 아닙니다.");
				System.out.println();
				return;
			}
			bite = 0;
		}
		sc.close();
	}

}
