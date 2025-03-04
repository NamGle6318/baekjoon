package baekjoon.fourOperation;

//백준 문제풀이 입출력과 사칙연산산 (https://www.acmicpc.net/) 참고

import java.util.Scanner;

public class sumEx5 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음 A+B, A-B, A*B, A/B(몫), A%B(나머지) 를 출력하는 프로그램 
        int a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        scanner.close();
    }
}
