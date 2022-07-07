package BaekJoon.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy11399 {
    /*
     * 이름 : ATM
     * 난이도 : 실버3
     * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	    정답 비율
     *  1 초	    256 MB	    59177	39077	31887	    66.694%

     *
     * 결과
     * 시간 제한	메모리 제한	코드길이
     *  280ms   19340KB     1014B
     *
     * 해당 문제 URL : https://www.acmicpc.net/problem/11399
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] time = new int[N];

        for(int i=0; i<N; i++){
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);

        int prevSum = 0; // 총 누적합
        int sum = 0 ; // 사람별 대기시간 총합 1+3+6+9+13 = 32

        for(int i =0; i<N ; i++) {
            // 이전까지의 누적합과 현재 사람이 걸리는 시간을 더해준다.
            // 총량 = 이전 총량 + 이전 합 + 개인시간
            sum += prevSum + time[i] ;

            // 이전까지의 누적합에 현재 걸리는 시간을 더해준다. 이걸해줘야 sum계산을 할때 순번대로 이전합이 더해진다.
            // 이전 합 = 이전 합 + 개인시간
            prevSum += time[i];
        }
        System.out.println(sum);
    }

}
