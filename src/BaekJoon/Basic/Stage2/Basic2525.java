package BaekJoon.Basic.Stage2;

import java.util.Scanner;

public class Basic2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int C = sc.nextInt();   // 더해줄 분

        if (0 <= H && H <= 23 && 0 <= M && M <= 59 && 0 <= C && C <= 1000) {
            if (M+C >= 60) {
                int sumM = (M + C) - 60;

                if(H<23) {
                    H += 1;
                }
                if(H>23){
                    H = 0;
                }

                System.out.println(H+" "+sumM);

            }
            if(M+C < 60) {
                int sumM = (M+C);

                if(H>23){
                    H += 1;
                }

                System.out.println(H+" "+sumM);

            }

        }
    }
}