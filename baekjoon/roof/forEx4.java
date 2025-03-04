package baekjoon.roof;

import java.util.Scanner;

public class forEx4 {
    public static void main(String[] args) {
        // 영수증에 명시된 총금액이 맞는지 확인하는 프로그램
        // 입력 : 첫줄에는 총 금액을 담을 X 를 입력
        //        두번째 줄에는 구매한 품목의 개수 N을 입력
        //        나머지 줄에는 구매한 품목의 가격 a 와 개수 b를 공백 한칸으로 입력
        // 출력 : 구매한 물건의 가격과 개수의 총 가격이 X와 일치하면 Yes 를 출력 일치하지 않는다면 No를 출력

        Scanner scanner = new Scanner(System.in);

        int X = 0; // 총금액
        int N = 0; // 품목의 개수
        int a = 0; // 품목의 가격
        int b = 0; // 품목의 개수

        int sum = 0;

        //총 금액 및 구매한 품목의 개수 입력
        X = scanner.nextInt(); 
        N = scanner.nextInt();

        // 품목의 개수만큼 입력을 반복해서 받음
        for (int i = 0; i < N; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            sum += a * b;
        }
        // 입력받은 총금액과 실제 총금액의 일치 확인
        boolean check = (X == sum);
        System.out.println((check) ? "Yes" : "No");
            scanner.close();
    }
}
