package HomeWork.d0319;

import java.util.Scanner;

public class FigmaArr extends Figma {

	Figma[] figList;

	FigmaArr() {

	}

	FigmaArr(Figma[] figList) {
		this.figList = figList;
	}

	int scan() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	int choose() {
		int i = 0;
		System.out.print("원하는 도형을 선택하세요. ");
		for (Figma f : figList) {
			System.out.print(++i + "." + f.getName() + " ");
		}
		System.out.println();
		return scan();
	}

	void outPut(int a) {
		a -= 1;
		if (a >= 0 && a < figList.length) {
			if (figList[a].spc == Math.PI) {
				System.out.printf("반지름 %d -> %s 넓이 : %.6f\n", figList[a].getX(), figList[a].getName(), figList[a].area());
			} else {
				System.out.printf("가로 %d, 세로 %d -> %s 넓이 : %.2f\n", figList[a].getX(), figList[a].getY(),
						figList[a].getName(), figList[a].area());
			}
		} else {
			System.out.println("잘못된 번호입니다.");
		}
	}

}
