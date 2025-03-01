package VariableStudy.baekjoon.condition;

import java.util.Scanner;

//H, M을 입력
//M 에서 45분을 감소한 H, M을 출력
//만약 M - 45의 값이 음수일 경우 H--, M += 60
//만약 H--한 값이 음수일 경우 H+= 24
public class ifEx5 {
    public static void main(String[] args) {
        //시간과 분을 입력하면 출력할때 45분 이른 시간과 분을 출력하는 프로그램
        //변수 H, M (0 ≤ H ≤ 23, 0 ≤ M ≤ 59), 알람 시간 H시 M분을 의미한다.

        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        //현재시간보다 45분 이른 시간
        M -= 45;
        
        //음수 방지 조건문
        if (M < 0) {
            M += 60;
            H--;
        }
        
        if (H < 0)
            H += 24;

        System.out.printf("%d %d", H, M);
    }
}


