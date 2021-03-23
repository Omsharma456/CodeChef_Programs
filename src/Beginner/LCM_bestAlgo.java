package Beginner;

import java.util.Scanner;

public class LCM_bestAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b-=a;
            }
        }
        int lcm=(a*b)/a;
        System.out.println(lcm);
    }
}
