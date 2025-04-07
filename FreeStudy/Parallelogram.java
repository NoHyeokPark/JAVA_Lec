package FreeStudy;

import java.util.Scanner;

public class Parallelogram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt(); 
		int x2 = sc.nextInt(); 
		int y2 = sc.nextInt(); 
		int x3 = sc.nextInt(); 
		int y3 = sc.nextInt(); 
		if(Math.abs((x1-x2)*(y1-y3)) == Math.abs((x1-x3)*(y1-y2))) {
			System.out.println(-1);
		} else {
			int a = pita((x1-x2),(y1-y2));
			int b = pita((x1-x3),(y1-y3));
			int c = pita((x3-x2),(y3-y2));
			
			System.out.println(2*(Math.sqrt(Math.max(Math.max(a, b), c)) - Math.sqrt(Math.min(Math.min(a, b), c))));
			
		}
		sc.close();
		
	}
	
	static int pita (int x,int y) {
		return (x*x+y*y);
		
	}
	
	

}
