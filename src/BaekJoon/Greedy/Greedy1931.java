package BaekJoon.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy1931 {
    public static void main(String[] args) {
        /*
         * 이름 : 회의실 배정
         * 난이도 : 실버 2
         * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	    정답 비율
         * 2 초	    128 MB	    109487	33520	23954	    29.335%
         *
         * 결과
         * 시간 제한	메모리 제한	코드길이
         * 1196ms   181072      1424B
         *
         * 해당 문제 URL : https://www.acmicpc.net/problem/1931
         */

        //첫번째 포인트
        // 종료시간을 기준으로 정렬한다.
        // 종료시간이 그다음 시작시간보다 작거나 같으면 된다.

        Scanner sc = new Scanner(System.in);

        //회의 수
        int N = sc.nextInt();

        /*
        열이 3개인 이유는 0=시작 1=종료 2=N순서
         */
        int[][] time = new int[N][2];


        for(int i=0 ; i < N ; i++) {
            time[i][0] = sc.nextInt();  // 시작시간
            time[i][1] = sc.nextInt();  // 종료시간
        }

        //끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                //종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
                if(o1[1] ==o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        //전(before time)타임 종료시간
        int prev_end_time = 0;

        for(int i = 0 ; i < N ; i++) {

            // 전타임 종료시간이 다음 회의시작 시간보다 작거나 같다면 갱신
            if(prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);

    }
}
