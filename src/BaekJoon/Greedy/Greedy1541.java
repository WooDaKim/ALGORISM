package BaekJoon.Greedy;

import java.util.Scanner;

public class Greedy1541 {

    /*
     * 이름 : 잃어버린 괄호
     * 난이도 : 실버 2
     * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	    정답 비율
     * 2 초	    128 MB	    41700	20507	16465	    49.000%
     *
     * 결과
     * 시간 제한	메모리 제한	코드길이
     *
     *
     * 해당 문제 URL :https://www.acmicpc.net/problem/1541
     */

    /*
    포인트
    덧셈을 먼저하고 뺄셈을 나중에 해라


     */

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int sum = Integer.MAX_VALUE; //초기 상태 여부 확인을 위한 값으로 설정
        String[] subtraction = sc.nextLine().split("-");

        for(int i = 0 ; i <subtraction.length; i++) {
            int temp = 0;   //temp == 뜻 : 임시적

            //뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            String[] addition = subtraction[i].split("\\+");

            // 덧셈으로 나뉜 토큰들을 모두 더한다.
            for(int j = 0; j<addition.length; j++) {
                temp += Integer.parseInt(addition[j]);
            }

            // 첫 번째 토큰인 경우 temp값이 첫 번째 수가 됨
            if( sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
    }


}
