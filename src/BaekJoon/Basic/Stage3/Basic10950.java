package BaekJoon.Basic.Stage3;

import java.util.Scanner;

public class Basic10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i =0 ; i<T ; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
    }

    public static class Basic2742 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if (n<=100000) {
                for(int i = n ; i>0 ; i--){
                    System.out.println(i);
                }
            }
        }
    }

    public static class Basic2739 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int i;

            for(i=1 ; i<10 ; i++){
                System.out.printf("%d * %d = %d\n", A,i, A*i);
            }
        }
    }
}
