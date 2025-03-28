package work.test1;

public class Lv0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
		        int min = 1000001;
		        int[] answer = new int[queries.length];
		        for(int i=0; i<queries.length; i++){
		            for(int j=queries[i][0]; j<=queries[i][1]; j++){
		            	System.out.printf("%d, %d //",min,arr[j]);
		                if(arr[j]>queries[i][2] && arr[j] < min){
		                        min = arr[j];
		                }
		            }
		            answer[i] = min;
		            if(min == 1000001)
		                min = -1;
		        }
		        
		   
	}

}
