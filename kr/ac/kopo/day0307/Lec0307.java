package kr.ac.kopo.day0307;

public class Lec0307 {
	
	
	public static void main (String[] args) {
	        String[] babbling = {"aya", "ye", "woo", "ma"};
		    int answer = 0;
	        String[] str = {"aya", "ye", "woo", "ma"};
	        for(int i=0; i<babbling.length; i++){
	            for(int j=0; j<str.length; j++){
	        if (babbling[i].equals(str[j])){
	            answer++;
	        }
	        }
	        }
	        
	        System.out.println(answer);
		
	
	}	
}


