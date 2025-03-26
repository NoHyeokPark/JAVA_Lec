package FreeStudy;

public class TestPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1; i<=100; i++) {
			System.out.print(i%10 + "     ");
			System.out.print((i/10)%3 + "     ");
			System.out.print(i%10.0%3 + "     " +i+"     ");
		if (10*i/100%3 == 0 || 10*i%100%3 ==0) {
			System.out.println("짝"); //
	} else {
		System.out.println();
	}
		}

}
}
