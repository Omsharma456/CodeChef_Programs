package Beginner;

import java.util.Scanner;

public class GCD_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int holdvalueA = a;
        int holdvalueB=b;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b-=a;
            }
        }
        System.out.println("GCD: " + a);
        System.out.println("LCM: "+((holdvalueA*holdvalueB)/a));
    }
}
