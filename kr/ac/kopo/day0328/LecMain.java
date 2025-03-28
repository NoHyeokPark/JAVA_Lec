package kr.ac.kopo.day0328;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LecMain {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		while(true) {
		try {
		int c = isr.read();
		if(c == -1) break;
		System.out.print((char)c);
		}catch(IOException e){
			e.printStackTrace();
		}
		}
	}
	
	class car extends Object{

		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
		
	}

}
