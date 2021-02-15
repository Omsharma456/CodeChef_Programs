package Beginner;

import java.util.Scanner;

public class sumOfDigit {
    public static int digitsum(int digit) {
        int sum=0;
        while (digit != 0) {
            sum+=digit%10;
            digit/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int digit=sc.nextInt();
            arr[i]=digitsum(digit);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

