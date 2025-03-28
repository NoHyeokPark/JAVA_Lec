package work.test1;

public class play {

	public static void main(String[] args) {
		double x = 0.31;
		float x2 = 0.31f;
		
		System.out.println(x == x2);
		System.out.println((double)x2);
		System.out.println((double)x);
		System.out.println(x == x2 || false);

	}

}
