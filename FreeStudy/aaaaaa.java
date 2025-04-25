package FreeStudy;


	import java.util.Scanner;
public class aaaaaa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 100000000;
		for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i = 1 ; i <= min/2 ; i++){
            int sum = 0;
            for(int j = 0 ; j < n ; j++){
                sum += (arr[j]%i);
            }
            if(sum == 0){
                System.out.println(i);
            }
        }

		sc.close();

	}

}
