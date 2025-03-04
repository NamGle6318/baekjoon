package baekjoon.array;

import java.util.Scanner;

//입력 3개 받아
// 첫째줄엔 배열의 길이 입력 받기
// 둘째줄엔 배열에 정수 기입
// 셋째줄에 찾을 정수 입력 받음
// for문 돌려서 찾을 정수의 개수 카운트 ++
public class arrayEx1 {
    public static void main(String[] args) {
        // 입력한 정수가 몇개 있는지 찾는 프로그램
        // 입력 : 첫째줄 정수의 개수 N
        // 둘째줄 정수 입력
        // 셋째줄 찾으려는 정수
        // 출력 : 해당 정수의 개수

        Scanner scanner = new Scanner(System.in);

        int N = 0;
        int v = 0;
        int count = 0;
        N = scanner.nextInt();
        // 배열의 길이 입력
        int[] numbers = new int[N];

        // numbers 배열 내 정수 기입
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();

        // numbers의 배열내에서 중복되는 개수를 찾을 정수 v를 입력
        v = scanner.nextInt();

        // 입력받은 정수의 개수를 세기
        for (int i = 0; i < numbers.length; i++)
            if (v == numbers[i])
                count++;

        System.out.println(count);

        scanner.close();
    }
}
