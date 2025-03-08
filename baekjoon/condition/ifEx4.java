package baekjoon.condition;

import java.util.Scanner;

// 1사분면 조건 : x, y > 0
// 2사분면 조건 : x < 0, y > 0
// 3사분면 조건 : x, y < 0
// 4사분면 조건 : x > 0, y < 0 

public class ifEx4 {
    public static void main(String[] args) {
        // 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고
        // 가정한다.
        // 조건 : 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean one = (x > 0 && y > 0);
        boolean two = (x < 0 && y > 0 );
        boolean three = (x < 0 && y < 0 );
        boolean four = (x > 0 && y < 0 );
        
        if (one)
            System.out.println("1");
        else if (two)
            System.out.println("2");
        else if (three)
            System.out.println("3");
        else if (four)
            System.out.println("4");

        scanner.close();
    }
}
