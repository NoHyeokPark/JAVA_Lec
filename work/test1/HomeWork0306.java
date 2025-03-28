package work.test1;

public class HomeWork0306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = new int[50];
        int i = 0;
        int n = 999;
        while(n != 1){
            answer[i] = n;
            i++;
            
            if (n%2 == 0){
                n /= 2;
            } else{
                n = 3 * n + 1;
            }
            
        }
        for(int j=0; j<50; j++) {
        System.out.printf("%d, " ,answer[j]);
	}
	}

}
