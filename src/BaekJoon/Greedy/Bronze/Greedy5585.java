package BaekJoon.Greedy.Bronze;

import java.util.Scanner;

public class Greedy5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //물건값
        int n = sc.nextInt();

        //카운터에서 받을 잔돈
        int k = 1000-n;

        //잔돈 매수
        int cnt = 0;

        //카운터에 가지고 있는 잔돈
        int[] counter = new int[6];
        counter[0] = 500;
        counter[1] = 100;
        counter[2] = 50;
        counter[3] = 10;
        counter[4] = 5;
        counter[5] = 1;

        for(int i =0 ; i <= 5 ; i++) {
            if (k >= counter[i]) {
                cnt += k / counter[i] ; //int이기때문에 무조건 1이상이 나온다. 그럼 1로 처리됨
                k %= counter[i]; // 1로처리되고 나머지 값을 다시 K에 넣는다.
            }
        }
        System.out.println(cnt);
    }
}
