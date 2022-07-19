package BaekJoon.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy11047 {
    /*
     * 이름 : 동전 0
     * 난이도 : 실버3
     * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	    정답 비율
     *  1 초	    256 MB	    74235	38719	30201	    52.075%
     *
     *  결과
     *  시간 제한	메모리 제한  코드길이
     *  224ms   11716KB   556B
     *
     * 해당 문제 URL : https://www.acmicpc.net/problem/11047
     */

    public static void main(String[] args) {
        //입력 받기
        Scanner sc = new Scanner(System.in);

        // N = 종류   K = 합  count = 최솟값
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        // 동전의 종류를 받을 배열 만들기 개수는 종류의 수만큼
        int[] coinType = new int[N];

        for(int i = 0 ; i < N ; i++) {
            // 배열에 숫자넣기
            coinType[i] = sc.nextInt();
        }

        for(int i = N-1 ; i>=0 ; i--) {
            if(coinType[i] <= K) {  //K 보다 작거나 같을때
                count += (K / coinType[i]);     // 이미 if문에서 조건이 걸렸기때문에 무조건 K는 배수가 된다.
                K %= coinType[i]; // 계산하고 나머지값
            }
        }
        System.out.println(count);



    }
}
