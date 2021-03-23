package Beginner;

import java.util.Arrays;
import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[3];
        while (n-- > 0) {
            for (int i = 0; i < 3; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[arr.length-2]);
        }
    }
}
