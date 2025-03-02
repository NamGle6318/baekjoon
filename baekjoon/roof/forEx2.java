package baekjoon.roof;

import java.util.Scanner;

//T를 입력받음
//T만큼 A, B를 입력받고 A+B의 결과값을  출력
//반복

public class forEx2 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

        // T = A + B를 몇번 진행할 것인지

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int A = 0, B = 0;

        for (int i = 1; i <= T; i++) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println(A + B);   
        }
    }
}
