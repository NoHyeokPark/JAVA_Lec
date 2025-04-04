package FreeStudy;
import java.util.Scanner;
public class Spiral {
	

	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int r1 = sc.nextInt();
			int c1 = sc.nextInt();
			int r2 = sc.nextInt();
			int c2 = sc.nextInt();
			
			int[][] arr = new int[10002][10002];
			int x = 5000;
			int y = 5000;
			int d = 1;
			int num = 1;
			arr[5000][5000] = 1;
			sc.close();
			out : for (int i = 2;; i+=2) {
				for(int j=1;j<=i;j++) {
					if(y==0)
						break out;
					if(j<=i/2) {
					arr[x][y+=d] = ++num;
					} else {
					arr[x-=d][y] = ++num;
					}
				}
				d = -d;
				System.out.println("x" + x);
				System.out.println("y" + y);
			}
			
			for (int i = r1+5000; i <= r2+5000; i++) {
				for (int j = c1+5000; j <= c2+5000; j++) {
					System.out.printf("%d ",arr[i][j]);
				}
				System.out.println();
			}

		}

	


}
