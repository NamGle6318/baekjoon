package VariableStudy.baekjoon.condition;

import java.util.Scanner;

// 변수 3개를 입력받음
// 상금을 받는 규칙의 차이 = 같은눈이 있냐 없냐, 같은 눈의 개수가 몇개냐

// 1번 조건 : 1 == 2 && 2 == 3 (모든 눈의 값이 같음)
// 같은 눈 = 아무거나
// 상금 : 10000 + 같은 눈 * 1000

// 2번 조건 : 1 == 2 || 1 == 3 || 2 == 3 (최소 2개의 값은 같음)
// 같은 눈 = (1 == 2 || 1 == 3) ? 1 : 3  
// 상금 : 1000 + 같은눈 * 100

// 3번 조건 : 1 != 2 && 2 != 3 (모든 눈의 값이 다름)
// 같은 눈 = x
// 가장 큰 눈 = (1 > 2 || 1 > 3)? 1 : (2 > 3) ? 2 : 3 

//1 2 3 비교
// 1 > 2, 1 > 3, 2 > 3

public class ifEx7 {
    public static void main(String[] args) {
        // 주사위 수 3개를 입력받아 정해진 규칙에따라 상금값을 출력하는 프로그램
        // 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        // 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        // 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sameNum = 0;
        int money = 0;

        // 주사위 3개의 값이 전부 다를 경우
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            int max = 0;
            if (num1 > num2 && num1 > num3)
                max = num1;
            else
                max = (num2 > num3) ? num2 : num3;
            money = max * 100;
        }
        // 주사위 3개의 값이 전부 같을 경우
        else if (num1 == num2 && num2 == num3) {
            sameNum = num1;
            money = 10000 + sameNum * 1000;
        }
        // 주사위 3개의 값중 2개만 같을 경우
        else {
            if (num1 == num2) {
                sameNum = num1;
            } else
                sameNum = (num1 == num3) ? num1 : num2;
            money = 1000 + sameNum * 100;
        }
        System.out.println(money);

        scanner.close();
    }
}

// 잘못된 예시 : 같은 수 찾는 조건을 모두 다르거나 같은 경우부터 찾아야하는데  
// if (num1 == num2 && num2 == num3) {
// sameNum = num1;
// money = 10000 + sameNum * 1000;
// } else if (num1 == num2 || num1 == num3 || num2 == num3) {
// sameNum = (num1 == num2 || num1 == num3) ? num1 : num2;
// money = 1000 + sameNum * 100;
// } else {
// int biggestNum = 0;
// if (num1 > num2 || num1 > num3) {
// biggestNum = num1;
// } else
// biggestNum = (num2 > num3 ? num2 : num3);
// money = biggestNum * 100;
// }
// test