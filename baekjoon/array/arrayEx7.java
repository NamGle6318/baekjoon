package baekjoon.array;

import java.util.Scanner;

// 1~30까지의 수 중, 28개의 수를 입력함.
// 입력하지 않은 수 2개를 찾아 출력
public class arrayEx7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[28]; // 28

        // 1. 28명의 학생 번호를 입력 받음
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        
        // 2. 1번부터 30번까지 수 중 없는 수를 찾기
        // 1번이 numbers에 있는지 확인
        // 1~30까지 증가하는 반복문 생성
        // 번호마다 numbers의 모든 값과 비교하기
        // 다 돌았는데 같은수가 아예 없다? check = true 만들기
        // check가 true일 경우 해당 번호 출력
        // 다 돌았는데 같은수가 있다? check = false
        // 즉 check = true -> 해당 번호는 결석이다
        boolean check = true;
        for (int i = 1; i <= 30; i++) {
            check = true;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    check = false;
                    break;
                }
            }
            if (check) { 
                System.out.println(i);
            }
        }
        // 3. 1~30중 없는 번호 2개를 출력

        scanner.close();
    }
}
// 경우 1 시작 숫자가 3 1-> 3
// 경우 2 중간에 숫자가 2번 빠짐



 
 
