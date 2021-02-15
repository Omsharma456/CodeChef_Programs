package Beginner;

import java.util.Scanner;

public class Lucky_four {
    public static int four(int num) {
        int count=0;
        while (num != 0) {
            int rem=num%10;
            if (rem == 4) {
                count++;
            }
            num/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            arr[i] = four(num);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
