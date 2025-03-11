package baekjoon.roof;

import java.util.Scanner;

// 조건문 사용 : 입력받은 값 2개가 0일때까지 무한 가동
// 문제 : 입력받은 값 2개가 0이면 출력을 하지 않아야함.

public class ForEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0; 
        int sum = 0;

        while (true) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            sum = num1 + num2;
            if (sum == 0) {
                break;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
