package kr.ac.kopo.day0325;

public class ExceptionMain {
	static void b() throws Exception{
		int[] a= {0,1};
		
		System.out.println(a[2]);
	}

	public static void main(String[] args) {
		
		
		
			try {
				b();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
