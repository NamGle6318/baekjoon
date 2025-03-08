package baekjoon.roof;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // N을 입력받고 N의 값만큼 *을 출력
        /* Ex) N = 5
         *     *
         *    **
         *   ***
         *  ****
         * *****
         */

         Scanner sc = new Scanner(System.in);
        
         int N = sc.nextInt();
         
         for (int i = 0; i < N; i++) { // 줄바꿈 N번
            for (int j = 0; j < N; j++)  // N만큼 문자 출력(" " or "*")
                System.out.print(((j < N - (i + 1)) ? " " : "*")); // 
            
            System.out.println();
         }
    }
}
