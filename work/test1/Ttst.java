package work.test1;

public class Ttst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 4;
		int r = 600;
		int[] five = new int[65];
        String a;
        for (int i=1; i<66; i++){
            a = Integer.toBinaryString(i);
            a = a.replaceAll("1","5");
            five[i-1] = Integer.parseInt(a);
        }
        int j=0;
        int k=0;
        for(int i=0; i<65; i++){
            if(five[i]<l && l<=five[i+1]) j=i+1; 
            if(five[i]<=r && r<five[i+1]) k=i;
        }
        int[] answer = new int[k-j+1];
        for(int i=0; i<answer.length; i++){
            answer[i] = five[j++];
        }
	}

}
