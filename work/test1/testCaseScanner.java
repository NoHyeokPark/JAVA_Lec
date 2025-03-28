package work.test1;

import java.util.Scanner;

public class testCaseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("글");
		a = sc.nextLine();
		System.out.println("숫");
		b = sc.nextInt();
		System.out.println(a + b);
		sc.close();
	}

}
