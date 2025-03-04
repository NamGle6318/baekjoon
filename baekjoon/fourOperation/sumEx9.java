package baekjoon.fourOperation;

//백준 문제풀이 입출력과 사칙연산 (https://www.acmicpc.net/) 참고

import java.util.Scanner;

public class sumEx9 {
    public static void main(String[] args) {
        // 자연수 세자리를 입력 받은 후 총 합의 값을 출력하는 프로그램
        long num1, num2, num3;

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextLong();
        num2 = scanner.nextLong();
        num3 = scanner.nextLong();
        
        System.out.println(num1 + num2 + num3);
        scanner.close();
    }
}
