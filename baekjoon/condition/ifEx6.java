package VariableStudy.baekjoon.condition;

import java.util.Scanner;

// 시간과 분, 요리시간을 입력 받음
// 시간을 분단위로 합한뒤 분과 합친 값을 temp에 대입
// temp 값이 1440을 초과할 경우 temp -= 1400
// 결과로 출력할 시간 = temp / 60, 분 = temp % 60 으로 출력
public class ifEx6 {
    public static void main(String[] args) {
        // 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램
        // 시간은 24시간 기준, 시간 = A / 분 = B / 요리시간 = C

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        //현재 시간을 분단위로 계산
        int temp = ((A * 60) + B) + C;
        
        //24시간인 1440분을 초과, 다음날로 간주
        // if (temp > 1440)
        //     temp -= 1440;

        A = temp / 60 % 24;
        B = temp % 60;

        System.out.println(A + " " + B);
    }
}
