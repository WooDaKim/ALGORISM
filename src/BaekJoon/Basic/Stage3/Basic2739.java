package BaekJoon.Basic.Stage3;

import java.util.Scanner;

public class Basic2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i <= 8; i++){
            System.out.println(N +" * "+ (i+1) +" = "+ N * (i+1) );
        }
    }
}
