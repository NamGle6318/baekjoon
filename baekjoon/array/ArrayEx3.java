package baekjoon.array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxNum = arr[0], minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        System.out.printf("%d %d", minNum, maxNum);
        sc.close();
    }
}
