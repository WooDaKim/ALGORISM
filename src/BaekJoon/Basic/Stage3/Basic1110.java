package BaekJoon.Basic.Stage3;

import java.util.Scanner;

public class Basic1110 {
    public static void main(String[] args) {
        //숫자 입력받기 1개
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int cnt = 0;
        int copy = N;

        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;

            if (copy == N) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
