package baekjoon.condition;

import java.util.Scanner;

public class ifEx1 {
    public static void main(String[] args) {
        //두 정수 A와 B를 입력하면 두 정수의 크기르 비교하여 대(>), 소(<), 같음(=)을 출력하는 프로그램

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A > B) 
            System.out.println(">");
        else if(A < B)
            System.out.println("<");
        else if(A == B)
            System.out.println("==");
    }
}
