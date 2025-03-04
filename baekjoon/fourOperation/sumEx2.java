package baekjoon.fourOperation;

//백준 문제풀이 1001번 (https://www.acmicpc.net/problem/1001) 참고

import java.util.Scanner;

public class sumEx2 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음 A-B를 출력하는 프로그램
        int a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a - b);

        scanner.close();
    }
}
