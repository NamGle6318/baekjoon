package baekjoon.bufferreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        //BufferedReader 사용법
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 인스턴스 생성
        System.out.println("s 입력"); 
        String s = bf.readLine(); // 문자열 입력
        // int i = Integer.parseInt(bf.readLine()); // String -> int

        StringTokenizer stringTokenizer = new StringTokenizer(s); // s의 문자열을 공백단위로 나눠줌
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        System.out.println(a + b);



    }

}