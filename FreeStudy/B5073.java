package FreeStudy;

import java.util.Scanner;

public class B5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x + y + z == 0) 
			break;	
		if (!valid(x,y,z)) {
			System.out.println("Invalid");
		} else if(x == y && y == z) {
			System.out.println("Equilateral");
		} else if(x == y || y == z || z == x) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
		}
		}
	
	static boolean valid (int x, int y, int z) {
		if(x>=y) {
			if(x>=z) {
				return x < y+z;
			} else {
				return z < x+y;
			}
		} else if(y>=z) {
			return y < x+z;
		} else {
			return z < x+y;
		}
	}
}
