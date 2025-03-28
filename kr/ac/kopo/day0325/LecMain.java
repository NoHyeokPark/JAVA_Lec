package kr.ac.kopo.day0325;

import java.util.Random;

public class LecMain {

	public static void main(String[] args) {

		System.out.println("---------------Start-----------------");
		Random r = new Random();
		int ran = r.nextInt(4);
		System.out.println("Random : " + ran);
		int[] arr = {1,2,3};
		try {
		System.out.println(10/ran);
		System.out.println(arr[3]);
		} catch(ArithmeticException ae){
			//System.out.println("message"+ ae.getMessage());
			ae.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
		}
		// catch(ArithmeticException | ArrayIndexOutOfBoundsException excep) or에 ||이 아니라 |를 씀 비트연산이기때문
		System.out.println("----------------End------------------");
	}

}
