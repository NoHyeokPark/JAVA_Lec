package kr.ac.kopo.day0312;

public class Lec0312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][];
		// int[] arr2 = new int[]; 불가능
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "]");
			System.out.println(arr[i].length);
			System.out.println();
		}
		System.out.println("---------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr" + i + j + "=" + arr[i][j]);
			}
		}
	}

}
