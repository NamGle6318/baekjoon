package baekjoon.roof;

import java.util.Scanner;

public class forEx5 {
    public static void main(String[] args) {
        // long int가 4바이트, long long int가 8 바이트, long을 붙힐때마다 4byte씩 늘어난다고 했을때
        // 정수 "N" byte를 입력하면 입력한 바이트만큼 long을 추가하는 프로그램(N은 4의배수)

        Scanner scanner = new Scanner(System.in);

        int N = 0; // byte값을 입력받을 N
        N = scanner.nextInt();

        int count = N / 4; 
        

        for (int i = 0; i < count; i++) {
            System.out.print("long ");
        }
        System.out.print("int");


            scanner.close();
    }
}
