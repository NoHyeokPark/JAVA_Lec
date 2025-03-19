package HomeWork.d0319;

import java.util.Random;
import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		int a;
		String con ="n";
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		while (con.charAt(0) != 'y' && con.charAt(0) != 'Y') {
		System.out.println("원하는 도형을 선택하세요.(1.삼각형, 2.직사각형, 3.정사각형, 4.원)");
		a = sc.nextInt();
		sc.nextLine();
		switch(a) {
		case 1:
			Triangle t = new Triangle(rd.nextInt(8)+2,rd.nextInt(8)+2);
			t.printArea();
			break;
		case 2:
			Rectangle r = new Rectangle(rd.nextInt(8)+2,rd.nextInt(8)+2);
			r.printArea();
			break;
		case 3:
			Square s = new Square(rd.nextInt(8)+2);
			s.printArea();
			break;
		case 4:
			Circle c = new Circle(rd.nextInt(8)+2);
			c.printArea();
			break;
			default :
		}
		System.out.println("그만두실건가요?");
		con = sc.nextLine();
		}
		sc.close();
	}

}
