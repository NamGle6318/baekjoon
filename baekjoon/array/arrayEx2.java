package baekjoon.array;

import java.util.Scanner;

public class arrayEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = 0; // 수열의 길이
        int X = 0; // 대,소를 비교할 정수

        N = scanner.nextInt();
        X = scanner.nextInt();

        int[] A = new int[N]; // 수열

        // 수열내에 정수 입력
        for (int i = 0; i < A.length; i++) 
            A[i] = scanner.nextInt();
        
        // 정수 X와 수열 내 정수를 비교
        // X보다 작은 수는 출력
        for (int i = 0; i < A.length; i++) {
            if (X > A[i]) 
                System.out.print(A[i] + " ");
        }

        scanner.close();
    }
}
