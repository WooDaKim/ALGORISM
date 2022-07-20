package BaekJoon.Greedy.Bronze;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greedy10162<i> {
    public static void main(String[] args) {

        int[] button = new int[3];
        button[0] = 300;
        button[1] = 60;
        button[2] = 10;

        Scanner sc = new Scanner(System.in);

        //요리시간
        int start = sc.nextInt();

        //최소버튼 개수
        int countA = 0;
        int countB = 0;
        int countC = 0;


        if (start == 0) {
            System.out.println(0);
        } else {
            countA = start / button[0];
            start %= button[0];

            countB = start / button[1];
            start %= button[1];

            countC = start / button[2];
            start %= button[2];


            if(start!=0){
                System.out.println(-1);
            }else {
                System.out.println(countA);
                System.out.println(countB);
                System.out.println(countC);
            }
        }





    }



}
