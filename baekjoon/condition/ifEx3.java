package baekjoon.condition;

import java.util.Scanner;

public class ifEx3 {
    public static void main(String[] args) {
        // 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
        // 윤년의 기준 : 연도가 4의 배수 이면서 100의 배수가 아닐 때 또는 400의 배수일때

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.println((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "1" : "0");

        scanner.close();
    }
}
