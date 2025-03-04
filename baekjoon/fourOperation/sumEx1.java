package baekjoon.fourOperation;

// 백준 문제풀이 1000번

import java.util.Scanner;

public class sumEx1 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음 A+B를 출력하는 프로그램
        int a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a + b);

        scanner.close();
    }
}
