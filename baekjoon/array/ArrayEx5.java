package baekjoon.array;

import java.util.Scanner;

// 바구니가 있고 N번의 숫자가 적힌 공이 있음.
// 첫째줄 바구니의 개수와 공을 던질 횟수
// 둘째줄 바구니의 범위 시작, 바구니의 범위 끝, 공의 번호
// 바구니엔 가장 마지막에 들어갔던 공의 번호 단 1개만 있을 수 있음.
// 출력문엔 바구니별로 몇번 공이 있는지, 없으면 0번

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] basket = new int[sc.nextInt()];
        int ballNum = sc.nextInt();

        int start, end, num;
        for (int i = 0; i < ballNum; i++) {
            start = sc.nextInt() - 1;
            end = sc.nextInt() - 1;
            num = sc.nextInt();
            for (int j = start; j <= end; j++) {
                basket[j] = num;
            }
        }
        for (int i : basket) {
            System.out.printf("%d ", i);
        }
    }
}
