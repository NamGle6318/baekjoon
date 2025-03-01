package VariableStudy.baekjoon.fourOperation;

//백준 문제풀이 10998번 (https://www.acmicpc.net/) 참고

import java.util.Scanner;

public class sumEx4 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음 A / B를 출력하는 프로그램 
        // 단 실제 계산 결과와 출력값이 10-9 이하면 정답
        double a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a / b);

        scanner.close();
    }
}
