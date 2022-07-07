package BaekJoon.Basic.Stage5;

import java.util.Scanner;

public class Basic10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //입력받을 정수의 개수

        int[] arrMaxMin = new int[N];

        for(int i = 0 ; i<N ; i++) {
            arrMaxMin[i] = sc.nextInt();
        }

        int temp = 0;

        for (int i = 0; i<arrMaxMin.length; i++){
            for (int j = i+1; j<arrMaxMin.length ; j++) {
                if(arrMaxMin[i]>arrMaxMin[j]) {
                    temp = arrMaxMin[i];
                    arrMaxMin[i] = arrMaxMin[j];
                    arrMaxMin[j] = temp;
                }
            }
        }

        //출력
        System.out.print(arrMaxMin[0] + " ");
        System.out.println(arrMaxMin[4]);
    }
}
