package baekjoon.array;

import java.util.Scanner;

// 상황 : 바구니가 N개 있고 바구니는 번호가 1번부터 N번까지 있다.
//        바구니에는 바구니의 번호와 같은 번호의 공이 있다.

// 입력 : 첫째줄 - 바구니의 개수(N)와 공을 바꿀 회수(M)
//        둘째줄 - 바구니 2개의 번호를 입력
//                 입력한 2개의 바구니의 공을 서로 교환

public class ArrayEx6 {
    public static void main(String[] args) {

        // 바구니의 개수 N과 공을 바꿀 회수 M 입력 받기
        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        int m = sc.nextInt();
        // 길이가 N인 바구니 배열의 각 칸마다 index 값 + 1의 공 번호 대입 (배열 1~n)
        for (int i = 0; i < n.length; i++) {
            n[i] = i + 1;
        }

        // 서로 바꿀 바구니 2개(i, j)의 번호를 입력 후 공 섞기
        int k = 0;
        int temp = 0;

        for (int i, j; k < m; k++) {
            i = sc.nextInt() - 1;
            j = sc.nextInt() - 1;
            temp = n[i];
            n[i] = n[j];
            n[j] = temp;
        }

        // 바구니 배열 값 출력
        for (int i : n) {
            System.out.print(i + " ");
        }
    }
}
