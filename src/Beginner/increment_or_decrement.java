package Beginner;

import java.util.Scanner;

public class increment_or_decrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n / 4 == 0) {
            System.out.println(++n);
        } else {
            System.out.println(--n);
        }
    }
}
