package BaekJoon.Basic.Stage5;

import java.util.Scanner;

public class Basic2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] arrMaxMin = new int[9];

        for(int i = 0 ; i<arrMaxMin.length ; i++) {
            arrMaxMin[i] = sc.nextInt();
        }
        sc.close();

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
        System.out.println(arrMaxMin[8]);
        System.out.println();
    }
    }

