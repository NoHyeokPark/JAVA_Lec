package FreeStudy;

import java.util.Scanner;

public class Resistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		long ans = 0;
		for(int i=0;i<2;i++) {
			a = sc.nextLine();
		switch (a) {
		case "white": ans+=1;
		case "grey" : ans+=1;
		case "violet": ans+=1;
		case "blue": ans+=1;
		case "green": ans+=1;
		case "yellow"  : ans+=1;
		case "orange" : ans+=1;
		case "red"  : ans+=1;
		case "brown" : ans+=1;
		case "black" : ;
		}
		ans *= 10;
		}
		
		a = sc.nextLine();
		switch (a) {
		case "white": ans*=10;
		case "grey" : ans*=10;
		case "violet": ans*=10;
		case "blue": ans*=10;
		case "green": ans*=10;
		case "yellow"  : ans*=10;
		case "orange" : ans*=10;
		case "red"  : ans*=10;
		case "brown" : ans*=10;
		case "black" : ans/=10;
		}
		System.out.println(ans);
		
		

	}

}
