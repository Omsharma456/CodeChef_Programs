package Beginner;

import java.util.Scanner;

public class puppy_and_sum {
    public static int sum(int times, int num) {
        int sum=0;
        if (times == 1) {
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            return sum;
        } else {
            while (times-- > 0) {
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                if (times != 0) {
                    num = sum;
                    sum = 0;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum(a, b));
        }
    }
}
