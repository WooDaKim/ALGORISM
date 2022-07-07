package BaekJoon.Basic.Stage1;

import java.util.Scanner;

public class Basic8_1008 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                double A = sc.nextInt();
                double B = sc.nextInt();

                sc.close();
                if(A>0 && B<10) {
                    System.out.println(A/B);
                }
    }
}
