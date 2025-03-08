package baekjoon.roof;

import java.util.Scanner;

public class ForEx6 {
    public static void main(String[] args) {
        // N을 입력받고 N의 값만큼 *을 출력
        /* Ex) N = 5
         * *
         * **
         * ***
         * ****
         * *****
         */

         Scanner sc = new Scanner(System.in);
        
         int N = sc.nextInt();
         
         for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) { // 별을 1개씩 추가 출력
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
