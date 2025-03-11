package baekjoon.roof;

import java.util.Scanner;

// EOF(End of File) : 더 이상 읽을 수 있는 데이터가 없음.

public class ForEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        while (sc.hasNextInt()) {   // scanner가 더이상 입력받을 정수값이 존재하지 않을 시 false
            
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);

        }
        sc.close();
    }
}
