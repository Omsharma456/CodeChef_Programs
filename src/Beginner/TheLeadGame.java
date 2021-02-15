package Beginner;

import java.util.Scanner;

public class TheLeadGame {
    public static int[] maxscore(int[] a, int[] b) {
        int[] arr=new int[2];
        int sumOffirst=0;
        int sumOfsecond=0;
        int max=0;
        for (int i = 0; i < a.length; i++) {
            sumOffirst+=a[i];
            sumOfsecond += b[i];
            int lead = Math.abs(a[i] - b[i]);
            if (lead > max) {
                max=lead;
            }
        }
        if (sumOffirst > sumOfsecond) {
            arr[0] = 1;
            arr[1] = max;
        } else {
            arr[0]=2;
            arr[1]=max;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playtime=sc.nextInt();
        int[] player1=new int[playtime];
        int[] player2 = new int[playtime];
        for (int i = 0; i < playtime; i++) {
            player1[i]=sc.nextInt();
            player2[i]=sc.nextInt();
        }
        int[] arr = maxscore(player1, player1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
