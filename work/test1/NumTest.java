package work.test1;

public class NumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
		for(int query[] : queries){
            for(int i=query[0];i<=query[1];i++){
                if(arr[i]%query[2] == 0) { 
                	System.out.printf("%d, %d, %d, %d\n",arr[i],query[2],arr[i]%query[2],query[1]);
                	arr[i] += 1;
                }
            }
        }
	}

}
