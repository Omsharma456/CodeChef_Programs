package Beginner;

import java.util.Scanner;

public class turbo_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            while (i>=1 && array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }
        for (int res : array) {
            System.out.println(res);
        }
    }
}
