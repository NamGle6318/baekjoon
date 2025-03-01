package VariableStudy.baekjoon.fourOperation;

//백준 문제풀이 입출력과 사칙연산 (https://www.acmicpc.net/) 참고

import java.util.Scanner;

public class sumEx6 {
    public static void main(String[] args) {
        // 불기연도를 입력시, 불기연도를 서기연도로 변환하여 출력해주는 프로그램. *단 불기연도를 입력하는 변수명은 y
        int y;

        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();

        System.out.println(y - 543);

        scanner.close();
    }
}
