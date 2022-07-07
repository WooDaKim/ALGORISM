package BaekJoon.Basic.Stage3;

import java.util.Scanner;

public class Basic8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int sum = 0;

        for (int i = 0 ; i<=A ; i++){
            sum += i;

        } System.out.println(sum);
    }
}
