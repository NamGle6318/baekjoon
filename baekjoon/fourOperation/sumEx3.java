package VariableStudy.baekjoon.fourOperation;

//백준 문제풀이 10998번 (https://www.acmicpc.net/) 참고

import java.util.Scanner;

public class sumEx3 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음 A x B를 출력하는 프로그램
        int a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a * b);

        scanner.close();
    }
}
