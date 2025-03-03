package baekjoon.roof;

import java.util.Scanner;

//n을 입력받음
//1~n까지의 합을 출력
//n * (n + 1) / 2 = 1~n 까지의 합

public class forEx3 {
    public static void main(String[] args) {
        // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     sum += i;
        // }

        sum = n * (n+1) / 2; //paring 공식

        System.out.println(sum);
    }
}

// pairing 공식 (직사각형 버전)
// 1부터 n 까지를 구하려고 하고, n = 5일 때 (n = *)

// *
// **
// ***
// ****
// *****

//위 삼각형을 직사각형을 만들기 위해 삼각형을 하나 더 만들고 이어 붙히면

// * *****
// ** ****
// *** ***
// **** **
// ***** *

//가로는 n + 1, 세로는 n 
// 직사각형의 넓이 = n * (n + 1)
// 1부터 n까지의 합 = n * (n + 1) / 2
