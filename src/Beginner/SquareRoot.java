package Beginner;

import java.util.Scanner;

public class SquareRoot {
    public static int  sqrt(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            arr[i] = sqrt(num);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
