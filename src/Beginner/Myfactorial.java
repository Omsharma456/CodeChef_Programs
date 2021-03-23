package Beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class Myfactorial {
    public static int factorial(int num) {
        int fact=1;
        if (num == 0 && num == 1) {
            return fact;
        } else {
            while (num != 1) {
                fact*=num;
                num--;
            }
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while (n --> 0) {
            int num = sc.nextInt();
            System.out.println(factorial(num));
        }
    }
}
