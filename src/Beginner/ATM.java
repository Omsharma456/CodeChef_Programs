package Beginner;

import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int withdrawAmount=sc.nextInt();
        double totalAmount=sc.nextDouble();
        if (withdrawAmount % 5 != 0 && withdrawAmount > totalAmount) {
            System.out.println(totalAmount);
        } else {
            System.out.println(totalAmount-withdrawAmount-0.5);
        }
    }
}
