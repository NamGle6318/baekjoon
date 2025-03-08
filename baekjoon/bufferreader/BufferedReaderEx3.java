package baekjoon.bufferreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BufferedReaderEx3 {
    public static void main(String[] args) throws IOException {
        // 첫줄에 T 입력받음 T : 출력할 개수
        // 두번째 줄에 A, B를 입력받음
        // "Case #1 A + B 의 값을 출력시킴 위 과정을 T번 반복함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = 0;
        int A = 0;
        int B = 0;
        String[] input;

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input = br.readLine().split(" ");
            A = Integer.parseInt(input[0]);
            B = Integer.parseInt(input[1]);
            bw.write("Case #");
            bw.write(i + 1 + ": ");
            bw.write((A + B) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}