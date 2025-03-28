package work.test1;

public class Work0306 {

	public static void main(String[] args) {
		final double PI = 3.14;
		//PI = 3.141592; //final이 적용되어있기떄문에 변경하려하면 에러남
		System.out.print(PI);

		int a = 1, b = 0;
		System.out.println(a++ == 2 && b++ == 0);
		System.out.println("a는" + a +"\n" + "b는" + b);
		
		if (a <= 1) {
			b++;
		} else {
			a++;
		}
		System.out.println("a는" + a +" " + "b는" + b);
	}

}
