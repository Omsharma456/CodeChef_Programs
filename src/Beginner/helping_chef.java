package Beginner;

import java.util.Scanner;

public class helping_chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int num=sc.nextInt();
            if (num < 10) {
                System.out.println("Thanks for helping Chef!");
            } else {
                System.out.println(-1);
            }
        }
    }
}
