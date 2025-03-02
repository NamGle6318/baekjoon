package baekjoon.roof;

import java.util.Scanner;


// N 을 곱할 변수 i 선언
// i는 i++되어 1부터 9까지 
//N * i 값을 출력
public class forEx1 {
 public static void main(String[] args) {
    //N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성
    //입력 : N(1<= N <= 9)
    //출력 : N * 1 ~ N * 9 까지 출력. N * 1 ~ N * 2 사이는 줄바꿈

    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for (int i = 1; i <= 9; i++)
        System.out.printf("%d * %d = %d\n", N, i, N * i);
    
    } 
}
