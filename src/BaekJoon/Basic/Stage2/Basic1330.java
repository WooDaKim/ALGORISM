package BaekJoon.Basic.Stage2;

import java.util.Scanner;

public class Basic1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A>B) {
            System.out.println(">");
        }
        if(A<B) {
            System.out.println("<");
        }
        if(A == B) {
            System.out.println("==");
        }

    }
}
