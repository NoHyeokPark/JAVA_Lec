package HomeWork.D0307;

public class Day0307HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] moum = { 'A', 'E', 'I', 'O', 'U' }; // 모음 배열
		System.out.printf("%-9s%s\n", "문자", "유니코드값");
		System.out.println("-----------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%-10c%d\n", moum[i], (int) moum[i]); // int로 형변환 했습니다
		}

	}

}
