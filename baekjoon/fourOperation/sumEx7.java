package baekjoon.fourOperation;

//백준 문제풀이 입출력과 사칙연산 (https://www.acmicpc.net/) 참고

import java.util.Scanner;

public class sumEx7 {
    public static void main(String[] args) {
        // 변수 A, B, C를 입력
        // 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) ×
        // (B%C))%C를 출력하는 프로그램
        int A, B, C;

        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);

        scanner.close();
    }
}
