package BaekJoon.Greedy.Bronze;

import java.util.Scanner;

public class Greedy2864 {
    public static void main(String[] args) {
        //최솟값찾기 문제
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();


        // 각 자리가 어떻게 5와 6임을 알아 낼수 있을끼? 배수로는 불가능 함
        //replace라는 치환방법이 있다.
        if(A % 10 == 5 || A % 10 == 6 || B % 10 == 5 || B % 10 == 6 ) { //1의 자리수
            if(A % 10 == 5) {
                System.out.println(A+B);
            }
        } else if( A % 100 == 5 || B % 100 == 6 ) { //10

        } else if( A % 1000 == 5 || B % 1000 == 6 ) { //100

        } else if( A % 10000 == 5 || B % 10000 == 6 ) {//1000

        } else if( A % 100000 == 5 || B % 100000 == 6 ) {//10000

        } else {

        }

        //더했을때



    }
}
