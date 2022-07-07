package BaekJoon.Basic.Stage1;

import java.util.Scanner;

public class Basic5_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A>0 && B< 10) {
            System.out.println(A+B);
        }
    }
}
