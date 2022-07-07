package BaekJoon.Basic.Stage2;

import java.util.Scanner;

public class Basic9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if(90<=A) {
            System.out.println("A");
        }
        if(80 <= A && A <= 89) {
            System.out.println("B");
        }
        if(70 <= A && A <= 79) {
            System.out.println("C");
        }
        if(60 <= A && A <= 69) {
            System.out.println("D");
        }
        if(60 > A) {
            System.out.println("F");
        }

    }
}
