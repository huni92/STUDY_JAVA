package practice.question01;

import java.util.Scanner;

public class LottoGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gameNum = sc.nextInt();

        int[] iarr = new int[gameNum];

        int randomNum = (int)(Math.random() * 45 + 1);
        System.out.println(randomNum);

        for(int i = 1; i > iarr.length; i++){
            iarr[i] = randomNum;


            System.out.print(iarr[i]);

        }


    }



}
