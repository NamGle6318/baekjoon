package baekjoon.fourOperation;

//백준 문제풀이 입출력과 사칙연산 (https://www.acmicpc.net/) 참고

import java.util.Scanner;

//100의 자리수 : 세자리 자연수 / 100
//10의 자리수 : 자연수 - 100의 자리수 / 10
//1의 자리수 : 자연수 - (10의자리수 * 10 + 100의자리수 * 100) 

public class sumEx8 {
    public static void main(String[] args) {
        // 세자리수의 자연수 2개를 입력 받은 후 세자리수 X 세자리수의 곱셈을 자리수별로 출력하는 프로그램
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //자리수의 숫자만 갖고오기
        int hundred = num2 / 100;
        int ten = (num2 - (hundred * 100)) / 10;
        int one = num2 - ((hundred * 100) + (ten * 10));

        System.out.println(num1 * one);
        System.out.println(num1 * ten);
        System.out.println(num1 * hundred);
        System.out.println(num1 * num2);

        // 안 좋은 예시
        // System.out.println(num1 * (num2 - (((num2 / 100) * 100) + (((num2 - ((num2 / 100) * 100)) / 10) * 10)))); 
        // System.out.println(num1 * (((num2 - (num2 / 100) * 100) / 10)));
        // System.out.println(num1 * (num2 / 100));
        // System.out.println(num1 * num2); // 6
        scanner.close();
    }
}
