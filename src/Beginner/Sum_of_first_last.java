package Beginner;

import java.util.Scanner;

public class Sum_of_first_last {
    public static int sumoffirstlast(int num) {
        int sum=num%10;
        while (num >= 10) {
            num/=10;
        }
        sum+=num;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            arr[i] = sumoffirstlast(num);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
