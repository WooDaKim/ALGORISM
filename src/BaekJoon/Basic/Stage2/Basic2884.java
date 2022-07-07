package BaekJoon.Basic.Stage2;

import java.util.Scanner;

public class Basic2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(0 <= H && H<= 23 && 0 <= M && M<= 59){

            if(0<H && M<45) {//m이 0보다 작아지는상황
                H = H-1;
                M = 60-(45-M);

            }else if(H<1 && M<45){
                H = 23;
                M = 60-(45-M);

            }else {
                M = M-45;
            }

            System.out.printf("%d %d", H, M);

        } else{
            System.out.println("시간을 입력해주세요.");
        }
    }
}
