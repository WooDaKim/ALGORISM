package BaekJoon.Greedy;

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

        // N = 종류   K = 합
        int N = sc.nextInt();
        int K = sc.nextInt();

        // coin 배열에 N개의 배열만큼 만든다.
        int[] coin = new int[N];

        for(int i=0 ; i < N ; i++) {
            //각 배열의 값을 받아넣는다.
            coin[i] = sc.nextInt();
        }

        // 코인의 최솟값
        int count = 0;

        //동전이 오름차순으로 입력이 주어지기때문에 반복문을 i = n-1로 시작하고(배열의 인덱스 시작이 0); i가 양수일때 까지만; 역행으로 계산해주자.
        for(int i=N-1 ; i >= 0; i--) {

            if(coin[i] <= K) {  //K 값보다 (입력받은 총량) coin인덱스 값이 작다면 실행하자
                // 최솟값 = 최솟값 + (합 / 배열)
                count = count + (K / coin[i]);
                // 합 % 배열 = 합
                K = K % coin[i];
            }

        }

        System.out.println(count);

    }

    /**
     * 풀이
     *
     * 동전의 최솟값을 구하는 과정
     * i) 가장 큰 동전으로 내서 개수를 줄일것인가
     * ii) 배수의 동전이 있는가?
     *
     */



}
