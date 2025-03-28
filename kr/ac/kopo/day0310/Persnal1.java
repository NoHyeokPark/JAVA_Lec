package kr.ac.kopo.day0310;

import java.util.Random;

public class Persnal1 {

	public static void main(String[] args) {
        Random r = new Random();
        int game = r.nextInt(91) + 10; // 10~100 범위의 난수 생성

        for (int i = 1; i <= game; i++) {
            if (i % 10 == 0) {
                printBboSsyong(i); // 10의 배수 처리
            } else if (contains369(i)) {
                System.out.println("짝"); // 3, 6, 9 포함 시 "짝"
            } else {
                System.out.println(i); // 일반 숫자 출력
            }
        }
    }

    // 숫자에 3, 6, 9가 포함되었는지 확인하는 메서드
    private static boolean contains369(int num) {
        String strNum = String.valueOf(num);
        return strNum.contains("3") || strNum.contains("6") || strNum.contains("9");
    }

    // 10의 배수일 때 "뽀숑" 출력하는 메서드
    private static void printBboSsyong(int num) {
        int tens = num / 10; // 십의 자리 수
        System.out.print("뽀".repeat(tens) + "숑\n");
    }

}
