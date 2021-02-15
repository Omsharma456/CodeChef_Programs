package Beginner;

import java.util.Scanner;

public class remainder {
    public static int rem(int a, int b) {
        return a%b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[i] = rem(a, b);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
