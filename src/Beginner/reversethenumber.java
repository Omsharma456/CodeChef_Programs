package Beginner;

import java.util.Scanner;

public class reversethenumber {
    public static int reverse(int num) {
        int reverse=0;
        while (num != 0) {
            reverse =reverse*10 + num % 10;
            num/=10;
        }return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            arr[i] = reverse(num);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
