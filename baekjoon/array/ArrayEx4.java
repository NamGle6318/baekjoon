package baekjoon.array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                num = i;
            }
        }
        System.out.println(max);
        System.out.println(num + 1);

        sc.close();
    }
}
